package day8.frame;

import java.awt.BorderLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import day8.Book;
import day8.BookDB;
import day8.BookDBImpl;

public class BookSelectListFrame extends JDialog{
	/**
	 * 
	 */
	private BookDB bookDB = new BookDBImpl(); // DB연결 필요한 컬레션 객체 생성 완료됨.
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	public BookSelectListFrame() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		table = new JTable(); 
		
		// Vector == ArrayList와 같은 기능
		String[] colume = {"번호", "제목", "저자", "가격", "분류", "날짜" };
		DefaultTableModel model = new DefaultTableModel(colume, 0);
		
		List<Book> list = bookDB.selectBookList();
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
		
		this.setSize(600, 500);
		this.setVisible(true);
	}
	
	
}
