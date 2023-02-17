package day15;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BookStore {

	private String phone;
	private String address;

	private List<Book> list = new ArrayList<>();

	// 책 추가
	public int addBook(Book book) {
		try {
			this.list.add(book);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	// 책 삭제
	public int removeBook(Book book) {
		try {
			this.list.remove(book);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	// 책제목이 포함된것 검색
	public List<Book> searchBook(String title) {
		List<Book> alist = new ArrayList<>();
		for (Book a : this.list) {
			if (a.getTitle().contains(title)) {
				alist.add(a);
			}
		}
		return alist;

	}

	// 가격보가 큰것만 검색
	public List<Book> searchBookPrice(long price) {
		List<Book> alist = new ArrayList<>();
		for (Book a : this.list) {
			if (a.getPrice() > price) {
				alist.add(a);
			}
		}
		return alist;

	}
}
