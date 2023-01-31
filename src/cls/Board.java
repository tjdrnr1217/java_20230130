package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



// 글번호(long) brdNo
// 글제목(String) brdTitle
// 글내용(String) brdContent
// 작성자(String) brdWriter
// 조회수(long) brdHit 
// 등록일자(Date) brdDate

// lombok 라이브러리 => 편리성, 연결성
// 오라클 라이브러리

@Getter
@Setter
@ToString

public class Board {
	
	// 적절한 타입으로 필요한 항목을 만드세요.
	// getter / setter
	// toString으로 만드세요.
	// Main5 생성한 다음 게시글 1개를 적절하 내용으로 추가한 후 출력하기
	
	private long brdno = 0L; //글번호
	private String brdTitle = ""; // 글제목
	private String brdContent = ""; // 글내용
	private String brdWriter = ""; // 작성자
	long brdHir = 0L; // 조회수
	Date brdDate = null ; // 등록일자
	
	
	@Override
	public String toString() {
		return "Board [brdno=" + brdno + ", brdTitle=" + brdTitle + ", brdContent=" + brdContent + ", brdWriter="
				+ brdWriter + ", brdHir=" + brdHir + ", brdDate=" + brdDate + "]";
	}

	public long getBrdno() {
		return brdno;
	}
	
	public void setBrdno(long brdno) {
		this.brdno = brdno;
	}
	
	public String getBrdTitle() {
		return brdTitle;
	}
	
	public void setBrdTitle(String brdTitle) {
		this.brdTitle = brdTitle;
	}
	
	public String getBrdContent() {
		return brdContent;
	}
	
	public void setBrdContent(String brdContent) {
		this.brdContent = brdContent;
	}
	
	public String getBrdWriter() {
		return brdWriter;
	}
	
	public void setBrdWriter(String brdWriter) {
		this.brdWriter = brdWriter;
	}
	
	public long getBrdHir() {
		return brdHir;
	}
	
	public void setBrdHir(long brdHir) {
		this.brdHir = brdHir;
	}
	
	public Date getBrdDate() {
		return brdDate;
	}
	
	public void setBrdDate(Date brdDate) {
		this.brdDate = brdDate;
	}
	

}
