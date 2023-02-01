package cls;
//2023.02.01(3)
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Professor {//교수
	private int code = 0; //교수코드
	private String name = null; //교수명
	private String room = null; //교수실(303호)
	private Date date = null; //날짜
	
	//생성자
	public Professor() {
		super();
	}
	
	//생성자
	public Professor(int code, String name, String room, Date date) {
		super();
		this.code = code;
		this.name = name;
		this.room = room;
		this.date = date;
	}
	
	//
	
	
}
