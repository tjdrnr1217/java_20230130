package day4;

//2023.02.02(1)
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {
	private int code = 0; // 물품코드
	private String name = null; // 물품명
	private String content = null; // 물품설명
	private long price = 0L; // 물품가격
	private int quantity = 0; // 수량
	private Date regdate = null; // 등록일
	private String memberid = null; // 판매자

	public Item() {
		super();
	}

	public Item(int code, String name, String content, long price, int quantity, Date regdate, String memberid) {
		super();
		this.code = code;
		this.name = name;
		this.content = content;
		this.price = price;
		this.quantity = quantity;
		this.regdate = regdate;
		this.memberid = memberid;
	}

	// 수량이 n개 미만이면 n개로 변경하는 메소드
	public int invalidquantity(int i) {
		if (this.quantity < i) {
			this.quantity = i;
			this.setQuantity(i);
		}

		return i;
	}

	// 가격에 할인율만큼 뺴서 리턴하는 메소드
	public long invalidprice(float a) {
		this.price = (long) (this.price - this.price * a);
		this.setPrice(this.price);
		return this.price;
	}

	// 총 판매금액을 리턴하는 메소드(가격*수량)
	public long total() {
		return (long)(this.price * this.quantity);
		 
	}

	// 내용이 20자 이상이면
	// ex)12345678901234567890..으로 변환하는 메소드
	public String invalidcontent() {
		if (this.content.length() >= 20) {
			return (this.content.substring(0, 20) + ".."); // substring(0,20)0부터20까지만 출력!
		}return this.content;
	}

	// 이름을 뒤집어서 반환하는 메소드
	// ex)가나다 => 다나가
	public void invalidname() {
		String str = this.name;
		/*reverse란?
		reverse는 직역하면 뒤바꾸다, 반전시키다가 됩니다
		문자열 뒤집는 메서드입니다
		하지만 String클래스에서는 reverse()를 제공하지 않아 변환해서 reverse()를 사용해야합니다
		StringBuilder, StringBuffer, Collection클래스에서 reverse() 메서드를 제공합니다
		String 문자열을 반전시키기 위해서는 위의 클래스로 변환해서 사용해야합니다*/
		
		//StringBulider클래스의 메서드 reverse()를 사용하여 문자열을 반전시킨다
		
		// StringBuilder 선언 및 입력
        StringBuffer sbr = new StringBuffer(str);
        // reverse 메서드 사용
        sbr.reverse();
        // 결과 출력
        System.out.println(sbr);
	}

	public String revName() {
		//가나다 => 다나가
		String ret = ""; //문자를 누적할 변수
		for(int i=this.name.length()-1; i>=0; i--) {
			char tmp = this.name.charAt(i);
			ret = ret + tmp;
		}
		return ret;
	}

}
