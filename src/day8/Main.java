package day8;

import day8.frame.BookInsertFrame;
import day8.frame.BookSelectListFrame;
import day8.frame.BookSelectListPageFrame;

//2023.02.08(1)
public class Main {

	// 화면을 실행시키는 역할
	public static void main(String[] args) {
		//new BookInsertFrame();
		//new BookSelectListFrame();
		new BookSelectListPageFrame();
		
//		BookDB bookDB = new BookDBImpl();
//		for(int i=0; i<23; i++) {
//			Book book = new Book();
//			book.setTitle("제목" + i);
//			book.setAuthor("저자" + i);
//			book.setPrice(10000+i);// String => long
//			book.setCate('A'); // String => char
//			bookDB.insertBook(book);
			
		}
	}


