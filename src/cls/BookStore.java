package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//2023.02.01(2)
//책판매
@Getter
@Setter
@ToString
// 전화번호, 위치, 보유책(100)
public class BookStore {
	//밑에는 변수다
	private String phone = ""; // 서점연락처
	private String address = ""; // 서점위치
	private Book[] books = null; // 책

	private int idx = 0; // 현재 추가되어 있는 책의 위치

	// 생성자 1번만 사용가능함. 반환값없음, 클레스명과 정확하게 일치.
	// 준비물이 없는 빈 생성자
	public BookStore() {
		this.books = new Book[100]; // 0~99까지임
	}

	// 책등록하는 메소드(함수) 필요
	public void insertBook(Book book) {
		if (this.idx >= 100) {
			System.out.println("책 추가 불가");
		} else {
			books[idx] = book;
			idx++;
		}
	}

	// 현재까지 등록된 책 목록 출력
	public void selectBook() {
		int i = 0;
		for (i = 0; i < idx; i++) {
			System.out.println(books[i].toString());
		}
	}

	// 마지막 등록한 책을삭제하는 메소드
	public void deletBook() {
		if (idx > 0) {
			idx--;
		}
	}
	
	//문제) 등록한 책전체 가격을 전달받은 할인율 변경 메소드
	public int discountPrice( float per) {
		//전체 보유하고 있는 책
		for(int i = 0; i<idx; i++) {
			long price = books[i].getPrice();
			//실수형 => 정수 => 결과 값에 손실이 일어남.
			//long => int
			//int => long
			long result = (long)(price -(price * per));
			this.books[i].setPrice(result);
		}
		return 1;
	}
	
	//문제) 가격이 1000원 이상인 책 수량을 반환하는 메소드
	// 개수는 if를 수행항 숫자를 반환
	public int priceQuery(int pr) {
		int count = 0;
		for(int i = 0; i<idx; i++) {
			if(this.books[i].getPrice() >= pr) {
				count++;
			}
		}
		return count;
		
	}
	
	//문제) 뷴류 코드가 전달받은 값이 항목만 출력하는 메소드
	public void printCate(char cate) {
		for(int i=0; i<idx; i++) {
			if(this.books[i].getCate() == cate) {
				System.out.println(this.books[i].toString());
			}
		}
		
	}
}
