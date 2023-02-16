package day14;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		MemberDB mdb = new MemberImpl();
		Map<String,Object> map = new HashMap();
		Member member = new Member();
		
		//회원삭제
//		mdb.memberDeleteOne("a");
		
		//비밀번호 수정
		map.put("_id", "ccc1");
		map.put("password", "55555");
		mdb.memberUpdatePwOne(map);
		
		
		
		// 회원정보수정
//		member.setId("aaa1");
//		member.setPassword("9999");
//		member.setName("이동준");
//		member.setPhone("0166");
//		member.setRole("V");
//		member.setAge(80);
//		mdb.memberUpdateOne(member);
		
		
		// 회원정보 조회
//		Member ret = mdb.MemberselectOne("a");
//		System.out.println(ret);
				
		// 로그인
//		map.put("_id", "aaa1");
//		map.put("password", "pw1");
//		
//		Member member = mdb.MemberLogin(map);
//		if(member == null) {
//			System.out.println("아이디 또는 암호가 틀립니다");
//		}
//		else {
//			System.out.println("로그인이 되었습니다");
//		}
		
		
		// 회원가입
		
//		member.setId("a");
//		member.setPassword("13");
//		member.setName("가");
//		member.setPhone("010-1231-456");
//		member.setRole("A");
//		member.setAge(15);
//		member.setRegdate(new Date());
//		
//		int ret = mdb.MemberJoin(member);
//		System.out.println(ret);
		
		
	}

}
