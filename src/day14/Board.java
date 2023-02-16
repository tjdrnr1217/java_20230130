package day14;

import java.util.Date;

import lombok.Data;
@Data
public class Board {
	long brdno = 0L; //글번호
	String brdTitle = ""; // 글제목
	String brdContent = ""; // 글내용
	String brdWriter = ""; // 작성자
	long brdHit = 0L; // 조회수
	Date brdDate = null ; // 등록일자
}
