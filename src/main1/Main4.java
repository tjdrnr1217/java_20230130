package main1;

import java.util.Date;

import cls.Member;

public class Main4 {

	public static void main(String[] args) {
		// 클레스명 객체명 = new 클레스명();
		Member member = new Member();
		member.setUserId("tjdrnr1217");
		member.setUseAge(28);
		member.setUserEmail("tjdrnr1217@nate.com");
		member.setUserPw("aaa");
		member.setUserPhone("010-0111-1111");
		Date date = new Date();
		member.setUserDate(date);

		System.out.println(member.toString());

	}

}