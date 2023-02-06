package day6;
//2023.02.06(2)
import java.util.Date;
// 타입용도
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ** 일반적으로 Member타입으로 사용하는 클래스는 getter/setter.toString 생성자
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	private String id = null; // 아이디
	private String password = null; // 암호
	private String name = null; // 이름
	private String phone = null; // 연락처 ex) 000-0000-0000
	private int age = 0; // 나이
	private String role = null; // 권한 이것은 권한 고객(c)또는 판매자(S)만 가능
	private Date regdate = null; // 등록일

}
