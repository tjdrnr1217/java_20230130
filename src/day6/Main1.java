package day6;

import java.util.Date;

//2023.02.06(1)금요일거 복습(2)
public class Main1 {

	public static void main(String[] args) {
		/*
		// 클레스명 객체명 = new 생성자종류()
		Exam1 exam1 = new Exam1(10);
		
		// 메소드는 객체명을 통해 접근
		exam1.printAge();
		
		// 다시 나이정보를 변경
		exam1.setAge(30);
		exam1.setAge(40);
		exam1.setAge(60);
		*/
		
		//2023.02.06(2) MemberDB클래스 인출
		// 1. 객체 생성
		// db서버에 접속하고 members collection 접속
		MemberDB mDB = new MemberDB();
		int ret = mDB.deletMember("aaa");
		System.out.println(ret);
		
		/*MemberDB mDB = new MemberDB();
		
		Member member = new Member();
		member.setId("aaa");
		member.setName("변경될이름");
		member.setPhone("010-1111-2222");
		member.setAge(33);
			
		int ret = mDB.updateMember(member);
		System.out.println(ret);*/
		
		//mDB.printMember();
		//mDB.printMembersName("가 나 다");
		//mDB.printMembersRolw("S");
		//mDB.printMembersAge(100);
		
		// 2.회원가입하고 싶은 임시 데이터 (아이디, 암호, 이름, 연락처, 나이, 권한, 현재시간)
		//Member member = new Member("aaa13","pw1","이름","010",12,"C",new Date());
		
		// 3. DB에 추가하는 메소드 수행
		//int ret = mDB.insertMember(member);
		//System.out.println(ret);
		
		
	}

}
