package day8;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

public class BookDBImpl implements BookDB {
	// 공통변수 생성자, 메소드 모두 접근 가능한 변수
	private MongoCollection<Document> seqenec = null;
	private MongoCollection<Document> books = null;

	// 생성자
	public BookDBImpl() {
		try {
			MongoDatabase db = MongoClients.create(Config.URL).getDatabase(Config.DBNAME);
			this.seqenec = db.getCollection("sequence");
			this.books = db.getCollection("books");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 책등록
	@Override
	public int insertBook(Book book) {
		try {
			// 책번호, 등록일자
			Bson filter = Filters.eq("_id", "SEQ_BOOK_NO");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.seqenec.findOneAndUpdate(filter, update);

			Document doc1 = new Document();
			doc1.append("_id", doc.getInteger("idx"));
			doc1.append("title", book.getTitle());
			doc1.append("author", book.getAuthor());
			doc1.append("price", book.getPrice());
			doc1.append("cate", book.getCate());
			doc1.append("date", book.getDate());

			InsertOneResult result = this.books.insertOne(doc1);
			System.out.println(result);
//			AcknowledgedInsertOneResult{insertedId=BsonInt32{value=101}}
			if (result.getInsertedId().asInt32().getValue() == doc.getInteger("idx")) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	// 책전체조회
	@Override
	public List<Book> selectBookList() {

		try {
			// 반환 타입을 위한 빈 배열 객체 생성(비어 있음)
			List<Book> list = new ArrayList<Book>();

			FindIterable<Document> docs = this.books.find();
			// docsdml 값을 list로 다 복사하기
			for (Document doc : docs) {
				Book book = new Book();
				book.setNo(doc.getInteger("_id"));
				book.setTitle(doc.getString("title"));
				book.setAuthor(doc.getString("author"));
				book.setPrice(doc.getLong("price"));
				book.setCate(doc.getString("cate").charAt(0)); // String => char
				book.setDate(doc.getDate("date"));

				list.add(book);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	// 책 10 개씩 조회
	// 데이터를 최소 21개 이상을 추가하세요
	// BookSelectListPageFrame.java
	@Override
	public List<Book> selectListPage(int page) {
		List<Book> list = new ArrayList<Book>();
		try {
			Bson sort = Filters.eq("_id", -1); // 책번호를 기준으로 내림차순(-1)
			// page가 1이면 => 0 page가 2면 => 10 page가 3 => 20
			MongoCursor<Document> docs = this.books.find().sort(sort).skip(10 * (page - 1)).limit(10).cursor();
			while (docs.hasNext()) {
				Document doc = docs.next();
				Book book = new Book();
				book.setNo(doc.getInteger("_id"));
				book.setTitle(doc.getString("title"));
				book.setAuthor(doc.getString("author"));
				book.setPrice(doc.getLong("price"));
				book.setCate(doc.getString("cate").charAt(0));
				book.setDate(doc.getDate("date"));

				list.add(book);

			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;

	}

	// 책삭제
	@Override
	public int deleteBook(int no) {

		return 0;
	}

	// 책수정
	@Override
	public int updateBook(Book book) {

		return 0;
	}

	// 책 1권 조회
	@Override
	public Book selectBookOne(int no) {

		return null;
	}

	// n이상 가격에 해당하는 책 조회
	@Override
	public List<Book> selectBookPrice(long price) {

		return null;
	}

	// 분류에 해당하는 항목 만 조회...
	@Override
	public List<Book> selectBookCate(char cate) {

		return null;
	}

}
