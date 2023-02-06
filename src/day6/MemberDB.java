package day6;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

//2023.02.06(2)

// 기능용 클래스
// 몽고 DB연동
public class MemberDB {

	// 변수는 모든 메소드에서 사용 가능하기 위해
	private MongoCollection<Document> collection = null;

	// 생성자
	public MemberDB() {
		// 공통변수가 아니기 때문에 생성자 내부에서만 사용사능한 변수 생성

		// final을 붙이면 생성시 값으로 프로그램이 끝날때까지 유지됨.이유는 바꿀 수 없기때문
		// mongodb://아이디:암호@서버주소:포트번호/디비명
		final String url = "mongodb://id207:pw207@1.234.5.158:37017/db207"; // url 생성;

		// 클레스를 통해서 접속이 가능함.
		MongoClient client = MongoClients.create(url); // url을 MongoClient객체(client)에 넣는다
		MongoDatabase db = client.getDatabase("db207"); // Client에 있는 'db207'db를 MongoDatebaes 객체(db)에 넣는다.
		this.collection = db.getCollection("members");
		// db에있는 db207에 속해 있는 이름 members 데이터를 MongoCollection<Document>의 객체(collection)에
		// 넣는다.

	}

	// 회원탈퇴 삭제
	public int deletMember(String id) {
		try {
			Bson filter = Filters.eq("_id", id);
			DeleteResult result = this.collection.deleteOne(filter);
			System.out.println(result.toString());
			if (result.getDeletedCount() == 1L) {
				return 1; // 일치하는게 있어서 1개를 지움
			}
			return 0; // 일치하는게 없어서 못지움
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 회원정보 수정(이름, 연락처, 나이만 바꿀 수 있다
	public int updateMember(Member member) {

		try {
			// 변경하고자 하는 항목의 조건 2번
			Bson filter = Filters.eq("_id", member.getId());

			// 변경할 항목들...3번
			Bson update1 = Updates.set("name", member.getName());
			Bson update2 = Updates.set("phone", member.getPhone());
			Bson update3 = Updates.set("age", member.getAge());

			// updateOne(조건, 변경값) => 변경값이 하나의 Bson만 가능..combine 4번
			Bson update = Updates.combine(update1, update2, update3);

			// 1번
			UpdateResult result = this.collection.updateOne(filter, update);

			System.out.println(result.toString());
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 문제1)고객, 판매자만 조회하는 필터 C, S
	public void printMembersRolw(String searchRole) {
		Bson filter = Filters.eq("role", searchRole);
		printAction(filter);
	}

	// 문제2) 나이가 n이상인 것만 필터
	// gte => 크거나 같다, gt => 크다,
	// lte => 작거나 같다, lt => 작다
	public void printMembersAge(int n) {
		Bson filter = Filters.gte("age", n);
		printAction(filter);
	}

	// 이름이 "가나다"인만 조회
	public void printMembersName(String searchName) {
		// 키가 또는 필드가 name인것 중에서 searchName솨 정확하게 일치하는 필터
		Bson filter = Filters.eq("name", searchName);
		MongoCursor<Document> list = this.collection.find(filter).iterator(); // 필터에 해당하는 것만
		printAction(filter);
		/*
		 * while(list.hasNext()) { // 2개 있으니 2번 수행 Document doc = list.next();
		 * System.out.println("아이디 => "+doc.getString("_id"));
		 * System.out.println("암호 => "+doc.getString("password"));
		 * System.out.println("나이 => "+doc.getInteger("age"));
		 * System.out.println("나이 => "+doc.getString("name"));
		 * System.out.println("나이 => "+doc.getString("phone"));
		 * System.out.println("-----------------------------");
		 */
	}

	private void printAction(Bson filter) {
		MongoCursor<Document> list = this.collection.find(filter).iterator(); // 필터에 해당하는 것만
		while (list.hasNext()) { // 2개 있으니 2번 수행
			Document doc = list.next();
			System.out.println("아이디 => " + doc.getString("_id"));
			System.out.println("암호 => " + doc.getString("password"));
			System.out.println("나이 => " + doc.getInteger("age"));
			System.out.println("나이 => " + doc.getString("name"));
			System.out.println("나이 => " + doc.getString("phone"));
			System.out.println("-----------------------------");
		}
	}

	// 전체 회원 조회 메소드
	public void printMember() {

		MongoCursor<Document> list = this.collection.find().cursor();
		// 1000 => 500개만 출력(x)
		// 반복자 => 처음부터 끝까지 전체다 반복할 거라고 가정
		// 몇개가 존재하는지 모름
		while (list.hasNext()) { // 그다음 가져올 데이터가 있습니까?
			// 그러면 1개 가져갈께요.
			Document doc = list.next();
			System.out.println("아이디 => " + doc.getString("_id"));
			System.out.println("암호 => " + doc.getString("password"));
			System.out.println("나이 => " + doc.getInteger("phone"));
			System.out.println("나이 => " + doc.getInteger("age"));
			System.out.println("나이 => " + doc.getString("name"));
			System.out.println("-----------------------------");
		}
	}

	// 회원가입 메소드
	public int insertMember(Member member) {
		try {
			// 정상동작
			Document doc = new Document();
			doc.append("_id", member.getId());
			// 키가 반드시 _id 기본키로 봄.
			doc.append("password", member.getPassword());
			doc.append("name", member.getName());
			doc.append("phone", member.getPhone());
			doc.append("role", member.getRole());
			doc.append("age", member.getAge());
			doc.append("regdate", member.getRegdate());

			InsertOneResult result = this.collection.insertOne(doc);
			System.out.println(result.toString());
			return 1;
		} catch (Exception e) {
			// 정상동작둥에 오류가 발생시 이쪽으로 수행됨.
			// Exception클래스의 e변수에 오류의 정보(오류 메시지)가 전송되게 함.
			e.printStackTrace(); // 오류메시지를 전체적으로 출력해줌. 개발자를 위한 기능
			return -1;
		}
	}

}
