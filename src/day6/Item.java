package day6;
//2023.02.06(3)
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private int code = 0; // 물품코드
	private String name = null; // 물품명
	private String content = null; // 물품설명
	private int price = 0; // 물품가격
	private int quantity = 0; // 수량
	private Date regdate = null; // 등록일
}
