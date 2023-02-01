package main2;

import java.util.Date;

import cls.Book;
//2023.02.01(1)
public class Main2 {

	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(); // Scanner은 빈곳이 없어 (System.in)<= 준비물이 필요하다
		// 클레스명 객체명 = new 생성자(준비물);
		Book book = new Book(1,"java","코망",4000,'A',new Date()); // 뒤에 Book이 생성자다.

		/*book.setNo(7);
		book.setTitle("Java");
		book.setAuthor("코망");
		book.setPrice(4000);
		book.setCate('A');
		book.setDate(new Date());*/

		System.out.println(book.toString());
	}

}
