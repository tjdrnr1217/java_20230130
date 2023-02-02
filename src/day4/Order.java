package day4;
//2023.02.02(1)
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
	private int no = 0; //주문번호
	private int cnt = 0; //주문수량
	private Date regdate= null; //주문일자
	private String membend= null; //주문자아이디
	private int itemcode = 0; //물품코드
}
