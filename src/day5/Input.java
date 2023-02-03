package day5;
//2023.02.03(4)
import java.util.Date;
import java.util.Scanner;

import cls.Book;

import day4.Member;

//입력을 담당하는 클래스
public class Input {
	
	//변수 x
	
	
	public static Member inputDate() {
		Scanner in = new Scanner(System.in);
		System.out.println("가입정보입력: 아이디, 암호, 이름, 연락처, 권한");
		// String date = new String("입력한값");
		// String의 메소드 중에서 split()=> 분할, trim()=> 공백제거
		// nextLine() => 공백을 포함할 수 있다 , next() => 공백을 포함하지 못한다.
		String date = in.nextLine(); // a, b, 가나다, 010-0000-0000, c
		in.close();
		//System.out.print(date);
		
		//문제 ,로 분할하고 각각의 데이터에 대해 앞뒤에 공백이 있으면 제거
		 String[] str = date.split(",");
		 Member member = null; //아직 객체가 안만들어 졌음
		 if(str.length == 5) { //입력한 항목이 정확한지 개수로 확인함.
			 member = new Member( str[0].trim(),
					 str[1].trim(),str[2].trim(),
					 str[3].trim(),str[4].trim(),
					 new Date()	);		 
		 } 
		 return member;
	}
	
	public static Book inputBookDate() {
		Scanner in1 = new Scanner(System.in);
		System.out.println("책정보입력-> 번호,이름,아아디,가격,권한");
		String str1 = in1.nextLine();	//1,3
		
		
		String[] date1 = str1.split(",");
		Book book = null;
		if(date1.length== 5) {
			// 형변환은 static메소드
			long no = Long.parseLong(date1[0]); //형변환
			String title = date1[1];
			String author = date1[2];
			long price = Long.parseLong(date1[3]);// 형변환
			char cate = date1[4].charAt(0);// 형변환
			book = new Book(no, title, author, price, cate, new Date());
		
		}
		return book;
		
	}
	

}
