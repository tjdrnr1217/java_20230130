package day4;
//2023.02.02(1)
import java.util.Date;

public class MemberMain {

	public static void main(String[] args) {
		// 1. 객체 생성(값 세팅)
		//클레스명 소문자클레스명 = new 생성자명();
		Member member = new Member("a", "a123", "가", "000-0000-0000", "S", new Date());
		
		//현재 클래스 가지고 있는 값을 확인
		System.out.println(member.toString());
		// 2.세팅된 이름값이 유효한지 확인하기
		System.out.println(member.invalidName());
		// 3.
		int result1 = member.Phonecheck();
		System.out.println(result1);
		// 4.
		System.out.println(member.roleCheck());
		// 5.
		System.out.println(member.Idlengthcheck());
		System.out.println(member.ChangePhone());
		
		
	

}
}
