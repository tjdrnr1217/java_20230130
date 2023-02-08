package day8.frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//2023.02.08(1)
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import day8.Book;
import day8.BookDB;
import day8.BookDBImpl;

public class BookInsertFrame extends JDialog implements ActionListener{//1번
	private JTextField textField; // 제목
	private JTextField textField_1; // 저자
	private JTextField textField_2;	// 가격
	private JTextField textField_3; // 분류	
	private JButton btnNewButton; // 등록하기	
	private BookDB bookDB = new BookDBImpl(); // 객체생성하기 => DB접속, 2개컬렉션 가져오기 수행..
	
	public BookInsertFrame() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(76, 63, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 104, 116, 21);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 147, 116, 21);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(76, 193, 116, 21);
		getContentPane().add(textField_3);
		
		this.btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(88, 235, 97, 23);
		this.btnNewButton.addActionListener(this); //3번(나한테 알려준다) 버튼이 눌러졌을때 나쪽으로 알려주라
		getContentPane().add(btnNewButton);
		
		this.setSize(300, 500);
		this.setVisible(true);
	}

	//2번
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼이 클릭될 때 실행되는 위치임.
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equals("등록하기")) {
			// 4개 항목의 값을 가져와서 DB에 저장하는 소스 구현
			String title = textField.getText();
			String author = textField_1.getText();
			String price = textField_2.getText();
			String cate = textField_3.getText();
			
			Book book = new Book();
			book.setTitle(title);
			book.setAuthor(author);
			book.setPrice(Long.parseLong(price));// String => long
			book.setCate(cate.charAt(0)); // String => char
			
			int ret = bookDB.insertBook(book);
			System.out.println(ret);
			if(ret == 1) {
				JOptionPane.showInternalMessageDialog(null,"책이 등록 성공");
				System.exit(0); // 화면을 종료 시키기
			}
			else {
				JOptionPane.showInternalMessageDialog(null,"책이 등록 실패");
			}
		}
	}
}
