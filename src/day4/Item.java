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
	private int code = 0; //물품코드
	private String name = null; // 물품명
	private String content = null; // 물품설명
	private long price = 0L; //물품가격
	private int quantity = 0; //수량
	private Date regdate = null; //등록일
	private String memberid= null; //판매자
	

}
