package day14;

import java.util.Map;

public interface MemberDB {

	// 회원가입
	public int MemberJoin(Member member);

	// 로그인
	public Member MemberLogin(Map<String, Object> map);

	// 회원정보조회
	public Member MemberselectOne(String id);

	// 회원정보변경(비밀번호변경X)
	public int memberUpdateOne(Member meber);

	// 비밀번호 변경
	public int memberUpdatePwOne(Map<String,Object> map);
	
	// 회원탈퇴
	public int memberDeleteOne(String id);

}
