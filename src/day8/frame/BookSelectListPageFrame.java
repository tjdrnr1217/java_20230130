package day8.frame;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import day8.Book;
import day8.BookDB;
import day8.BookDBImpl;

public class BookSelectListPageFrame extends JDialog implements ItemListener{
	
	private BookDB bookDB = new BookDBImpl();
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JComboBox<String> combo;
	
	public BookSelectListPageFrame() {
		// 전체 레이아웃 BorderLayout
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		// 중앙의 table위치
		table = new JTable();
		String[] colume = {"번호", "제목", "저자", "가격", "분류", "날짜" };
		DefaultTableModel model = new DefaultTableModel(colume, 0);	
		List<Book> list = bookDB.selectListPage(1);
		for(Book book : list) {
			String[] date = {
					book.getNo()+"",
					book.getTitle(),
					book.getAuthor(),
					book.getPrice()+"", // 문자 + 숫자 = 문자(형변환)
					book.getCate()+"",
					book.getDate()+"",
			};
			model.addRow(date);
		}
		table.setModel(model);
		JScrollPane jscrollPane = new JScrollPane(table);
		getContentPane().add(jscrollPane, BorderLayout.CENTER);
	
		
		
		
		
		
		//위쪽의 페이지번호
		combo = new JComboBox<>();
		combo.addItem("1");
		combo.addItem("2");
		combo.addItem("3");
		combo.addItem("4");
		combo.addItemListener(this);
		getContentPane().add(combo,BorderLayout.NORTH);

		
//		String[] colume = {"번호", "제목", "저자", "가격", "분류", "날짜" };			
//		DefaultTableModel model = new DefaultTableModel(colume, 0);	
//		List<Book> list = bookDB.selectListPage(2);
//		for(Book book : list) {
//			String[] date = {
//					book.getNo()+"",
//					book.getTitle(),
//					book.getAuthor(),
//					book.getPrice()+"", // 문자 + 숫자 = 문자(형변환)
//					book.getCate()+"",
//					book.getDate()+"",
//			};
//			model.addRow(date);
//		}
//		table.setModel(model);
		
		

		
		this.setSize(600,500);
		this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			// 여기가 선택된
			System.out.println(combo.getSelectedItem());
			
			int page = Integer.parseInt(combo.getSelectedItem().toString());
			
			String[] colume = {"번호", "제목", "저자", "가격", "분류", "날짜" };			
			DefaultTableModel model = new DefaultTableModel(colume, 0);				
			List<Book> list = bookDB.selectListPage(page);
			for(Book book : list) {
				String[] date = {
						book.getNo()+"",
						book.getTitle(),
						book.getAuthor(),
						book.getPrice()+"", // 문자 + 숫자 = 문자(형변환)
						book.getCate()+"",
						book.getDate()+"",
				};
				model.addRow(date);
			}
			table.setModel(model);
			
		}
		
	}

}
