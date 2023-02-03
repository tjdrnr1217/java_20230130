package day5;

import java.util.ArrayList;

//2023.02.03(4)
import cls.Book;
import day4.Member;

//출력을 담당하는 클래스
public class Output {

	// 변수x
	
	public static void printBookList(ArrayList<Book> list) {
		for(int i = 0; i < list.size(); i++) {
			Book oneBook = list.get(i);
			printBook(oneBook);
		}
	}
	
	public static void printMember(Member member) {

		System.out.println("========가입정보=========");
		System.out.println("아이디는" + member.getId());
		System.out.println("암호는" + member.getPassword());
		System.out.println("이름은" + member.getName());
		System.out.println("번호는" + member.getPhone());
		System.out.println("권한은" + member.getRole());
		System.out.println("날짜는" + member.getRegdate());
		System.out.println("========================");
	}

	public static void printBook(Book book) {

		System.out.println("========가입정보=========");
		System.out.println("아이디는" + book.getNo());
		System.out.println("암호는" + book.getTitle());
		System.out.println("이름은" + book.getAuthor());
		System.out.println("번호는" + book.getPrice());
		System.out.println("권한은" + book.getCate());
		System.out.println("날짜는" + book.getDate());
		System.out.println("========================");
	}
	
	
}
