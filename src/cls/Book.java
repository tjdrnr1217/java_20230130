package cls;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//2023.02.01(1)
// 책번호 no, 책제목 title, 저자 author, 가격 12000, 분류 cate 'A','B','C', 등록일자 date

@Getter
@Setter
@ToString
@NoArgsConstructor //(빈곳)
@AllArgsConstructor //(준비물 필요한 곳)
public class Book {
	private long no = 0L; //번호
	private String title = null; //이름
	private String author = null; //내용
	private long price = 0; // 가격
	private char cate = 'A'; //권한
	private Date date = null; //날

	// 메소드(함수)
	public void print() { // void 반환타입이 있다.

	}

	// 생성자 만드는 방범 -> 오른쪽 마우스 -> 소스 -> 밑에서 2,3
	// 생성자 Constructor 클레스명과 같음, 반환타입없음
	/*public Book() {
		//super(); //반드시 만들어야 한다(빈거)
		// TODO Auto-generated constructor stub
	}*/
	
	//밑에 있는 것이 (클레스명 객체명 = new 생성자 (준비물)) 중에 준비물에 속한다
	/*public Book(long no, String title) {
		super();
		this.no = no;
		this.title = title;
	}*/

	/*public Book(long no, String title, String author, long price, char cate, Date date) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.price = price;
		this.cate = cate;
		this.date = date;*/
	}


