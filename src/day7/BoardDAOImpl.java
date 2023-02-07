package day7;

//2023.02.07(3)
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

public class BoardDAOImpl implements BoardDAO {
	// 아이디:암호@서버주소:포트번호/DB명
	final String URL = "mongodb://id207:pw207@1.234.5.158:37017/db207";

	private MongoCollection<Document> boardColl = null; // boards
	private MongoCollection<Document> seqColl = null; // sequence //데이터베이스에 시퀀스의 테이블

	public BoardDAOImpl() {
		try {
			// 설계도면 객체 = 클레스명.정적메소드()
			// 정적메소드는 객체가 1개만 생성되기 때문에 리소스 낭비가 없음.
			MongoClient client = MongoClients.create(URL);
			if (client != null)
				this.boardColl = client.getDatabase("db207").getCollection("boards");
			this.seqColl = client.getDatabase("db207").getCollection("sequence");
			System.out.println("DB접속 성공시점");

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("DB접속 실패했음");
		}

	}

	// 글제목, 내용, 작설자 정보만 전달
	// 글번호(시퀀스), 조회수 1, 날짜 현재시간
	@Override
	public int insertBoard(Board board) {
		try {
			// 시퀀스를 이용한 idx값을 받고 idx값을 1증가 시키기
			Bson filter = Filters.eq("_id", "SEQ_BOARD_NO");
			Bson update = Updates.inc("idx", 1); // 1씩 증가

			// 1을 가져오고 2로바꿔줌
			Document doc = this.seqColl.findOneAndUpdate(filter, update);

			// 받은 idx값으로 글번호를 설정하기
			board.setBrdno(doc.getLong("idx"));
			board.setBrdHit(100L);
			board.setBrdDate(new Date());

			// Board 타입의 값을 Document로 복사 하세요.
			Document doc1 = new Document();
			doc1.append("_id", board.getBrdno());
			doc1.append("brdTitle", board.getBrdTitle());
			doc1.append("brdContent", board.getBrdContent());
			doc1.append("brdWriter", board.getBrdWriter());
			doc1.append("brdHit", board.getBrdHit());
			doc1.append("brdDate", board.getBrdDate());

			InsertOneResult result = this.boardColl.insertOne(doc1);
			System.out.println(result);

			if (result.getInsertedId().asInt64().getValue() == board.getBrdno()) {
				return 1;
			}
			return 0;

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 글번호와 제목, 내용, 작성자를 전송하면 해당글번호의 제목, 내용, 작성자를 변하기
	@Override
	public int updateBoard(Board board) {
		try {
			Bson filter = Filters.eq("_id", board.getBrdno());

			Bson update1 = Updates.set("brdTitle", board.getBrdTitle());
			Bson update2 = Updates.set("brdContent", board.getBrdContent());
			Bson update3 = Updates.set("brdWriter", board.getBrdWriter());
			Bson update4 = Updates.set("brdHit", board.getBrdHit());

			Bson update = Updates.combine(update1, update2, update3, update4);
			UpdateResult result1 = this.boardColl.updateOne(filter, update);
			System.out.println(result1.toString());
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	// 글번호가 전달되면 1개 삭제
	@Override
	public int deleteBoard(long no) {
		try {
			Bson filter = Filters.eq("_i", no);
			DeleteResult result = this.boardColl.deleteOne(filter);
			System.out.println(result.toString());
			if (result.getDeletedCount() == 1L) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	// 게시글 조회
	@Override
	public List<Board> selectBoardList() {
		// Board타입을 n개 보관할 수 있는 동적배열
		List<Board> list = new ArrayList<Board>();
		try {
			// 글번호를 기준으로 내림차순(-1), 오름차순(1)
			Bson sort = Filters.eq("_id", 1);
			MongoCursor<Document> docs = this.boardColl.find().sort(sort).cursor(); // sort() => 정렬
			while (docs.hasNext()) { // docs에 꺼낼 요소가 존재하나요?
				Document doc = docs.next(); // 1개 꺼내기(전체 개수 1감소했음)
				Board board = new Board();
				board.setBrdno(doc.getLong("_id"));
				board.setBrdTitle(doc.getString("brdTitle"));
				board.setBrdContent(doc.getString("brdContent"));
				board.setBrdWriter(doc.getString("brdWriter"));
				board.setBrdHit(doc.getLong("brdHit"));
				board.setBrdDate(doc.getDate("brdDate"));

				// Document => Board 복사
				list.add(board);
			}
			// 정상동작

		} catch (Exception e) {
			// 오류발생처리
			e.printStackTrace();
			return null;
		} finally {
			// 정상이든 오류든 모두 실행
		}
		return list;
	}

	// 조회수가 hit보다 작은것만 조회해서 메인에서 출력하기.
	@Override
	public List<Board> selectBoardHitList(long hit) {
		List<Board> list = new ArrayList<Board>();
		
		try {
		Bson filter = Filters.lte("brdHit", hit);
		MongoCursor<Document> docs = this.boardColl.find(filter).iterator();
		while (docs.hasNext()) { // 2개 있으니 2번 수행
			Document doc = docs.next();
			Board board = new Board(); //List<Board>에 넣을 빈깡통
			board.setBrdno(doc.getLong("_id"));
			board.setBrdTitle(doc.getString("brdTitle"));
			board.setBrdContent(doc.getString("brdContent"));
			board.setBrdWriter(doc.getString("brdWriter"));
			board.setBrdHit(doc.getLong("brdHit"));
			board.setBrdDate(doc.getDate("brdDate"));
			
			list.add(board);
		}
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
		return list;
		
		
}

	// 게시글 1개 조회
	@Override
	public Board selectBoardOne(long no) {
		try {
			Bson filter = Filters.eq("_id", no);
			Document doc = this.boardColl.find(filter).first();
			System.out.println(doc.toString());

			Board board = new Board();
			board.setBrdno(doc.getLong("_id"));
			board.setBrdTitle(doc.getString("brdTitle"));
			board.setBrdContent(doc.getString("brdContent"));
			board.setBrdWriter(doc.getString("brdWriter"));
			board.setBrdHit(doc.getLong("brdHit"));
			board.setBrdDate(doc.getDate("brdDate"));

			return board;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
