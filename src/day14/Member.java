package day14;

import java.util.Date;

import lombok.Data;
@Data
public class Member {
	
	private String id = null; // 아이디
	private String password = null; // 암호
	private String name = null; // 이름
	private String phone = null; // 연락처 ex) 000-0000-0000
	private String role = null; // 권한 이것은 권한 고객(c)또는 판매자(S)만 가능
	private int age = 0; //
	private Date regdate = null; // 등록일
}
