package day7;
//2023.02.07(3)
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
public class Board {
	
	private long brdno = 0L; //글번호
	private String brdTitle = ""; // 글제목
	private String brdContent = ""; // 글내용
	private String brdWriter = ""; // 작성자
	long brdHit = 0L; // 조회수
	Date brdDate = null ; // 등록일자
	
}
