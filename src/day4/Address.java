package day4;
//2023.02.02(1)
import java.text.SimpleDateFormat;
//2023.02.02(1)
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
	private long code = 0; // 주소코드
	private String address = null; // 주소
	private String postcode = null; // 우편번호
	private Date regdate = null; // 등록일
	private Member memberid = null; // 아이디

	public Address() {
		super();
	}

	public Address(long code, String address, String postcode, Date regdate, Member memberid) {
		super();
		this.code = code;
		this.address = address;
		this.postcode = postcode;
		this.regdate = regdate;
		this.memberid = memberid;
	}

	// 코드는 1000~9999 사이인지 확인
	public boolean invalidcode() {
		if (this.code >= 1000 && this.code <= 9999) {
			return true;
		}
		return false;
	}

	// 주소는 100미만인지 확인
	public boolean invaliaddress() {
		// String
		if (this.address.length() < 100) {
			return true;
		}
		return false;
	}

	// 우편변호가 5자리인지 확인
	public boolean invalipostcode() {
		if (this.postcode.length() == 5) {
			return true;
		}
		return false;
	}
	
	//Date => String
	// 날짜에서 년만 반환하기(문자로)
	public String getYear() {
		SimpleDateFormat obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
		String str = obj.format(this.regdate);
		return str.substring(0,4); // 0123=>2023
	}

	// 날짜에서 월만 반환하기(문자로)
	public String getMonth() {
		SimpleDateFormat obj1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
		String str1 = obj1.format(this.regdate);
		return str1.substring(5, 7);
	}

	// 날짜에서 일만 반환하기(문자로)
	public String getday() {
		SimpleDateFormat obj1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
		String str1 = obj1.format(this.regdate);
		return str1.substring(9, 11);
	}
}
