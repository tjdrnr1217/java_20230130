package day10;
//2023.02.10(1)
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
	private String id = null; // 아이디
	private String password = null; // 암호
	private String name = null; // 이름
	private String phone = null; // 연락처 ex) 000-0000-0000
	private String role = null; // 권한 이것은 권한 고객(c)또는 판매자(S)만 가능
	private int age = 0;
	private Date regdate = null; // 등록일

	// getter, setter, toString 생성하기 lombok사용하기

	public Member() {
		super();
	}

	public Member(String id, String password, String name, String phone, String role, Date regdate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.role = role;
		this.regdate = regdate;
	}

	// 이름의 길이가 유요한지 확인하는 메소드 만들기(2~4자만 가능)
	public boolean invalidName() {
		if (this.name.length() >= 2 && this.name.length() <= 4) {
			return true; // 메소드가 종료됨.
		}
		return false; // else 쓰지 않고 이렇게 사용해도 똑같다
	}
	// 2~4자 사이만 true를 그이외에는 false를 반환하기

	// 휴대폰 번호 길이가 정확한지 확인하는 메소드 만들기
	public int Phonecheck() { // public void -> 반환값이 필요가 없다.
		if (this.getPhone().length() != 13) {
			return 1;
		}
		return 0;

	}

	// 권한 정보가 C와 S로만 되어 있는지 확인하는 메소드
	public boolean roleCheck() {
		if (this.getRole().equals("C") || this.getRole().equals("S")) { // equals함수 -> 비교할때 쓰는 함수
			return true;
		}
		return false;
	}

	// id는 길이가 30자 이내만 가능한지 확인하는 메소드
	public boolean Idlengthcheck() {
		if (this.getId().length() <= 30) {
			return true;
		}
		return false;

	}

	// 연락처 정보가 000-0000-0000인데 00000000000으로 반환 하는 메소드(split사용하기)
	public String ChangePhone() {
		//000-0000-0000
		//ret[0] => 000
		//ret[1] => 0000
		//ret[2] => 0000
		//ret.length => 3
		String ret[] = this.getPhone().split("-");
		System.out.println(ret.length);
		System.out.println(ret[0]);
		System.out.println(ret[1]);
		System.out.println(ret[2]);
		
		return (ret[0] + ret[1] + ret[2] );
	}

}
