package day14;

import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class MemberImpl implements MemberDB {
	MongoCollection<Document> members = null;

	public MemberImpl() {
		members = DBConn.getInstance().getCollection(Config.MEMBERCOL);
	}

	// 회원가입
	@Override
	public int MemberJoin(Member member) {
		try {
			Document doc = new Document();

			doc.append("_id", member.getId());
			doc.append("password", member.getPassword());
			doc.append("name", member.getName());
			doc.append("phone", member.getPhone());
			doc.append("role", member.getRole());
			doc.append("age", member.getAge());
			doc.append("regdate", member.getRegdate());

			InsertOneResult result = this.members.insertOne(doc);
			System.out.println(result);
			if (result.getInsertedId().asString().getValue() == member.getId()) {
				return 1;
			}

			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	// 1.아이디를 이용해서 정보를 가져옴. 아이디와 암호가 일치하는 확인후에 반환
	// 2. 아이디,암호를 and 필터를 이용해서 조회
	@Override
	public Member MemberLogin(Map<String, Object> map) {
		try {
// 			2.
//			Bson id = Filters.eq("_id", map.get("_id"));
//			Bson pw = Filters.eq("password", map.get("password"));
//			
//			Bson filter = Filters.and(id,pw);
//			
//			Document doc  = this.members.find(filter).first();
//			
//			Member member = new Member();
//			member.setId(doc.getString("_id"));
//			member.setPassword(doc.getString("password"));
//			member.setName(doc.getString("name"));
//			member.setPhone(doc.getString("phone"));
//			member.setRole(doc.getString("role"));
//			member.setAge(doc.getInteger("age"));
//			member.setRegdate(doc.getDate("regdate"));
//			
//			if(doc.getString("_id").equals(map.get("_id")) && doc.getString("password").equals(map.get("password"))) 
//				return member;{		
//			}

		} catch (Exception e) {

		}
		return null;
	}

	// 회원정보출력
	@Override
	public Member MemberselectOne(String id) {
		try {
			Document document = this.members.find(Filters.eq("_id", id)).first();
			Member member = new Member();
			member.setId(document.getString("_id"));
			member.setPassword(document.getString("password"));
			member.setName(document.getString("name"));
			member.setPhone(document.getString("phone"));
			member.setRole(document.getString("role"));
			member.setAge(document.getInteger("age"));
			member.setRegdate(document.getDate("regdate"));
			return member;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 회원정보수정(비밀번호제외)
	@Override
	public int memberUpdateOne(Member member) {
		try {
			Bson filter = Filters.eq("_id", member.getId());

			Bson update1 = Updates.set("name", member.getName());
			Bson update2 = Updates.set("phone", member.getPhone());
			Bson update3 = Updates.set("role", member.getRole());
			Bson update4 = Updates.set("age", member.getAge());

			Bson update = Updates.combine(update1, update2, update3, update4);
			UpdateResult result = this.members.updateOne(filter, update);
			if (result.getModifiedCount() == 1) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	// 비밀번호 변경
	@Override
	public int memberUpdatePwOne(Map<String, Object> map) {
		try {
			String id = (String)map.get("_id"); // 현재 아이디
			String pw = (String)map.get("password");// 현재비번
			String pw1 = (String)map.get("password1"); // 바꿀비번
			
			//Filters.and()
			Member member =  this.MemberLogin(map);
			if(member != null) { //로그인 성공
				Bson filter = Filters.eq("_id", id);
				Bson update = Updates.set("password", pw1);
				UpdateResult result = this.members.updateOne(filter, update);
				if(result.getModifiedCount() == 1L) {
				return 1;
				}
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 회원탈퇴
	@Override
	public int memberDeleteOne(String id) {
		try {
			Bson filter = Filters.eq("_id", id);
			DeleteResult result = this.members.deleteOne(filter);
			System.out.println(result);
			if (result.getDeletedCount() == 1L) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
