package day10;

import java.util.ArrayList;
import java.util.HashMap;
//2023.02.10
import java.util.List;
import java.util.Map;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertOneResult;

import day8.Config;

public class MemberDBImpl implements MemberDB {

	// 클레스 전역 변수( 생성자, 메소드 모든 곳에서 사용가능)
	private MongoCollection<Document> members = null; // 초기값은 null

	// DB연동 및 컬렉션 연결하기
	public MemberDBImpl() {
		this.members = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.MEMBERCOL);

	}

	@Override
	public int insertMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertMemberMap(Map<String, Object> map) {
		try {
			Document doc = new Document();
			// 몽고DB에서 기본키(중복불가)에 _id,
			doc.put("_id", map.get("_id"));
			doc.put("password", map.get("password"));
			doc.put("name", map.get("name"));
			doc.put("phone", map.get("phone"));
			doc.put("role", map.get("role"));
			doc.put("age", map.get("age"));
			doc.put("regdate", map.get("regdate"));
			
			InsertOneResult result = this.members.insertOne(doc);
			System.out.println(result);
			if(result.getInsertedId().asString().getValue().equals(map.get("_id"))) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	@Override
	public Member selectMemberOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selecMemberMapOne(String id) {
		try {
			Document doc = this.members.find(Filters.eq("_id", id)).first(); //첫번째거 한개만 꺼낸다
			if( doc != null) {
				return documentToMap(doc);
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<Member> selectMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> selectMemberMapList() {
		try {
			FindIterable<Document> docs = this.members.find(); // 전체니깐 조건은 없다
			List<Map<String, Object>> list = new ArrayList<>();
			
			for(Document doc : docs) {
				list.add(documentToMap(doc));
			}
			if(!list.isEmpty()) {
				return list;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	// Document => Map으로 바꿔주는 메소드
	private Map<String, Object> documentToMap(Document doc) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("_id", doc.get("_id"));
		map.put("password", doc.get("password"));
		map.put("name", doc.get("name"));
		map.put("phone", doc.get("phone"));
		map.put("role", doc.get("role"));
		map.put("regdate", doc.get("regdate"));
		map.put("age", doc.get("age"));
		return map;
	}

}
