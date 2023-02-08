package day8;

import java.util.List;

//2023.02.08(1)
public interface BookDB {
	
	// 책등록
	public int insertBook(Book book);
	
	// 책전체조회
	public List<Book> selectBookList();
	
	// 책 10 개씩 조회
	public List<Book> selectListPage(int page);
	
	// 책삭제
	public int deleteBook(int no);
	
	// 책수정
	public int updateBook(Book book);
	
	// 책 1권 조회
	public Book selectBookOne(int no);
	
	// n이상 가격에 해당하는 책 조회
	public List<Book> selectBookPrice(long price);
	
	// 분류에 해당하는 항목 만 조회...
	public List<Book> selectBookCate(char cate);
}
