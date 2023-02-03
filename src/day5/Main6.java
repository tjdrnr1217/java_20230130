package day5;



import java.util.ArrayList;

import cls.Book;

//2023.02.03(5)
// 1. mongodb
// 데이터베이스의 주소: 1.234.5.158 <= ihongss.com
// 포트번호 : 37017
// 데이터베이스 : db200 ex> db213
// 아이디 : id 200 ex)id200
// 암호 : pw200 ex) pw200
//mongodb://id200:pw200@1.234.5.158:37017/db200
public class Main6 {

	public static void main(String[] args) {
		
		// 책을 여러권 보관 가변 길이 배열
		ArrayList<Book> list = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			Book book = Input.inputBookDate();
			list.add(book);
		}
		// 테스트용
		//System.out.println(list.toString());		
		Output.printBookList(list);
	}

}
