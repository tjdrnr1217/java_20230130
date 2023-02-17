package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;
import day9.Board;

public class ItemDBImpl implements ItemDB {

	private MongoCollection<Document> sequence = null;
	private MongoCollection<Document> items = null;

	public ItemDBImpl() {
		this.sequence = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.RESEQUNCECOL);
		this.items = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.ITEMCOL);
	}

	// 물품 전체 목록
	@Override
	public List<Map<String, Object>> selectItemListMap(int n) {
		try {
			Bson sort = Filters.eq("_id", -1);

			FindIterable<Document> docs = this.items.find().sort(sort).limit(n);

			List<Map<String, Object>> list = new ArrayList<>();
			for (Document doc : docs) {
				Map<String, Object> map = new HashMap<>();
				map.put("_id", doc.getLong("_id"));
				map.put("name", doc.getString("name"));
				map.put("content", doc.getString("content"));
				map.put("price", doc.getInteger("price"));
				map.put("quantity", doc.getInteger("quantity"));
				map.put("regdate", doc.getDate("regdate"));

				list.add(map);
			}
			return list;
			// List<Map>타입으로 반환해서 리턴
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 물품 등록
	@Override
	public int insertItemMap(Map<String, Object> map) {
		try {
			Bson filter = Filters.eq("_id", "SEQ_ITEM_CODE");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.sequence.findOneAndUpdate(filter, update);
			long itemCode = doc.getInteger("idx");

			Document saveDoc = new Document();
			saveDoc.append("_id", itemCode); // 시퀀스에서 꺼낸값
			saveDoc.append("name", map.get("name"));
			saveDoc.append("content", map.get("content"));
			saveDoc.append("price", map.get("price"));
			saveDoc.append("quantity", map.get("quantity"));
			saveDoc.append("regdate", new Date()); // 현재 시간

			InsertOneResult result = this.items.insertOne(saveDoc);
			if (result.getInsertedId().asInt64().getValue() == itemCode) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	// 물품 1개 삭제 ex)1004
	@Override
	public int deleteItemOne(long no) {
		try {
			Bson filter = Filters.eq("_id",no);
			DeleteResult result=this.items.deleteOne(filter);
			if(result.getDeletedCount() == 1L) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	//물품 n개 삭제 ex{1004,1007,1010}
	@Override
	public int deleteItemMany(long[] no) {
		try {
			int cnt = 0;
			// long[] no = {1,2,5,6}
			// 조건n개에 n개를 지움
			for (int i = 0; i < no.length; i++) {
				Bson filter = Filters.eq("_id", no[i]);
				DeleteResult result = this.items.deleteOne(filter);
				cnt += result.getDeletedCount(); // 삭제시 1개씩 더하기
			}
			// 삭제한 개수 == 배열의 개수
			if (cnt == no.length) {
				return 1;
			}
			return 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 물품 수정(name, content, price, quantity)를 변경하기
	@Override
	public int updateItemOne(Item item) {
		try {
			Bson filter = Filters.eq("_id",item.getNo());
			
			Bson update1 = Updates.set("name", item.getName());
			Bson update2 = Updates.set("content", item.getContent());
			Bson update3 = Updates.set("price", item.getPrice());
			Bson update4 = Updates.set("quantity", item.getQuantity());
			
			Bson update = Updates.combine(update1,update2,update3,update4);
			
			UpdateResult result = this.items.updateOne(filter, update);
			System.out.println(result.toString());
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Item> selectItemList(int n) {
		
		try {
			List<Item> list = new ArrayList<Item>();
			Bson sort = Filters.eq("_id",1);
			FindIterable<Document> docs = this.items.find().sort(sort);
			for(Document doc : docs) {
				Item i = new Item();
				i.setNo(doc.getLong("_id"));
				i.setName(doc.getString("name"));
				i.setContent(doc.getString("content"));
				i.setPrice(doc.getInteger("price"));
				i.setQuantity(doc.getInteger("quantity"));
				i.setRegdate(doc.getDate("regdate"));
				
				list.add(i);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
