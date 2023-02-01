package cls;
//2023.02.01(3)
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class Register {//수강신청
	
	private int code = 0; //코드
	private Course course = null; // 신청과목
	private Student student = null; // 학생
	private Date date = new Date();
	
	//Main5에서 수강신청하기(2개 수강하기)

}
