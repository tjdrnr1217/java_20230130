package day14;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class BoardDBImpl implements BoardDB {
	MongoCollection<Document> boards = null;
	MongoCollection<Document> squenec = null;

	public BoardDBImpl() {
		boards = DBConn.getInstance().getCollection(Config.BOARDCOL);
		squenec = DBConn.getInstance().getCollection(Config.RESEQUNCECOL);
	}

	// 게시판 글쓰기
	@Override
	public int insertBoardOne(Board board) {
		try {
			Document doc = this.squenec.findOneAndUpdate(Filters.eq("_id", "SEQ_ADDRESS_CODE"), 
						Updates.inc("idx", 1));
			long code = (long) doc.get("idx");
						
			Document doc1 = new Document();
			doc1.append("_id",code);
			doc1.append("brdTitle",board.getBrdTitle());
			doc1.append("brdContent",board.getBrdContent());
			doc1.append("brdWriter",board.getBrdWriter());
			doc1.append("brdHit",board.getBrdHit());
			doc1.append("brdDate",board.getBrdDate());
			
			InsertOneResult result = this.boards.insertOne(doc1);
			System.out.println(result);
			if (result.getInsertedId().asInt64().getValue() == board.getBrdno()) {
				
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	// 게시판 조회(최신글 순으로 10개씩, 페이지네이션)
	@Override
	public List<Board> selectBoardList(int page) {
		try {
			// page 1 => 0
			// page 2 => 10
			// page 3 => 20
			Bson sort = Filters.eq("_id", -1);
			FindIterable<Document> doc = this.boards.find().sort(sort).skip(page-1*10).limit(10);
			List<Board> list = new ArrayList<Board>();
			
			for(Document docs : doc) {
				Board board = new Board();
				board.setBrdno(docs.getLong("_id"));
				board.setBrdTitle(docs.getString("brdTitle"));			
				board.setBrdContent(docs.getString("brdContent"));
				board.setBrdWriter(docs.getString("brdWriter"));
				board.setBrdHit(docs.getLong("brdHit"));
				board.setBrdDate(docs.getDate("brdDate"));
				
			list.add(board);
						
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 게시판 수정(제목,내용만 변경)
	@Override
	public int updateBoardOne(Board board) {
		try {
			Bson filter = Filters.eq("_id",board.getBrdno());
			
			Bson update1 = Updates.set("brdTitle", board.getBrdTitle());
			Bson update2 = Updates.set("brdContent", board.getBrdContent());
			
			Bson update = Updates.combine(update1,update2);
			UpdateResult result = this.boards.updateOne(filter, update);
			if (result.getModifiedCount() == 1) {
				
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 게시판 1개 조회
	@Override
	public Board selectBoardOne(long no) {
		try {
			Bson filter = Filters.eq("_id", no);
			Document document = this.boards.find(filter).first();
			Board board = new Board();
			board.setBrdno(document.getLong("_id"));
			board.setBrdTitle(document.getString("brdTitle"));			
			board.setBrdContent(document.getString("brdContent"));
			board.setBrdWriter(document.getString("brdWriter"));
			board.setBrdHit(document.getLong("brdHit"));
			board.setBrdDate(document.getDate("brdDate"));
			
			return board;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 게시판 삭제
	@Override
	public int deleteBoardOne(long no) {
		try {
			Bson filter = Filters.eq("_id",no);
			DeleteResult result = this.boards.deleteOne(filter);
			System.out.println(result);
			if (result.getDeletedCount() == 1L) {
				return 1;
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
