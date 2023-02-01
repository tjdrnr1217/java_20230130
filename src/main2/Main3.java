package main2;

import java.util.Date;

import cls.Book;
import cls.BookStore;

//2023.02.01(2)
public class Main3 {

	public static void main(String[] args) {
		//서점이 생성됨. 책을 100권 보관할 수 있는 배열생성
		BookStore bookStore = new BookStore();
		
		bookStore.setPhone("051-707-7070");
		bookStore.setAddress("부산 남구");	
		
		// 추가하고자 하는 책을 생성
		Book book = new Book(100,"java","저자",1230,'B',new Date());
		
		
		//서점에 1권의 책 등록
		bookStore.insertBook(book);
		
		
		//문제1) 임의의 책을 2권 생성한 후 서점에 등록하기
		Book book1 = new Book(101,"java1","저자1",1231,'A',new Date());		
		Book book2 = new Book(102,"java2","저자2",1232,'C',new Date());
		bookStore.insertBook(book1);
		bookStore.insertBook(book2);
		bookStore.deletBook();
		bookStore.discountPrice(0.2f);
		System.out.println(bookStore.priceQuery(100));
		bookStore.printCate('B');
		
		//현재까지 등록된 책 조회
		//bookStore.selectBook();
		
		
	
		
		
	}	

}
