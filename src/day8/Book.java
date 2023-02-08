package day8;
//2023.02.08(1)
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
public class Book {
	
	private int no = 0; //번호
	private String title = null; //이름
	private String author = null; //저자
	private long price = 0; // 가격
	private char cate = 'A'; //분류
	private Date date = new Date(); //등록일자
}
