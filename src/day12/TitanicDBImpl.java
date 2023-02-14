package day12;

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

import day11.Titanic;
import day8.Config;

public class TitanicDBImpl implements TitanicDB{
	private MongoCollection<Document> titanic = null;
	
	// 1. titanic 컬레션 접속하기
	public TitanicDBImpl() {
		try {
			this.titanic =MongoClients.create(Config.URL)
			.getDatabase(Config.DBNAME)
			.getCollection(Config.TITANICCOL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//전체조회
	@Override
	public List<Titanic> selecTitanicList() {
		try {
			Bson sort = Filters.eq("fare",1);
			// 원본 타입
			FindIterable<Document> docs =this.titanic.find().sort(sort);
			// 반환타입
			List<Titanic> list = new ArrayList<>();
			
			// 원본 타입 반복
			for(Document t : docs) {
				Titanic titanic = new Titanic();
				titanic.setFare(t.getDouble("fare").floatValue());
				titanic.setSurvived(t.getString("survived"));
				titanic.setPclass(t.getInteger("pclass"));
				titanic.setSex(t.getString("sex"));
				titanic.setSibsp(t.getInteger("sibsp"));
				titanic.setParch(t.getInteger("parch"));
				titanic.setTicket(t.getString("ticket"));
				titanic.setCabin(t.getString("cabin"));
				titanic.setEmbarked(t.getString("embarked"));
				titanic.setName(t.getString("name"));
				titanic.setPassengerid(t.getInteger("passengerid"));
				titanic.setAge(t.getDouble("age").floatValue());
				titanic.setRegdate(new Date());
				
				list.add(titanic);
				
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public List<Map<String, Object>> selectTitanicListMap() {
		try {
			// Map<String,Object> == Titanic 타입과 같은 기능
			FindIterable<Document> docs =this.titanic.find().sort(Filters.eq("fare",1));
			List<Map<String, Object>> list = new ArrayList<>();
			
			
			for(Document doc : docs) {
				Map<String,Object> map = new HashMap<String, Object>();
				map.put("fare",doc.get("fare"));
				map.put("survived",doc.get("survived"));
				map.put("pclass",doc.get("pclass"));
				map.put("sex",doc.get("sex"));
				map.put("sibsp",doc.get("sibsp"));
				map.put("parch",doc.get("parch"));
				map.put("ticket",doc.get("ticket"));
				map.put("cabin",doc.get("cabin"));
				map.put("embarked",doc.get("embarked"));
				map.put("name",doc.get("name"));
				map.put("passengerid",doc.get("passengerid"));
				map.put("age",doc.get("age"));
				map.put("regdate",doc.get("regdate"));
				map.put("fare",doc.get("fare"));
				map.put("fare",doc.get("fare"));
				
				list.add(map);
			}
		
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 나이순으로 정렬한 후 n명 조회
	public List<Titanic> selectTitanicAge(int n) {
		try {
			List<Titanic> list = new ArrayList<Titanic>();
			Bson sort = Filters.eq("age", -1);
			FindIterable<Document> docs =this.titanic.find().sort(sort).limit(n);
			
			for(Document t : docs) {
				Titanic titanic = new Titanic();
				titanic.setFare(t.getDouble("fare").floatValue());
				titanic.setSurvived(t.getString("survived"));
				titanic.setPclass(t.getInteger("pclass"));
				titanic.setSex(t.getString("sex"));
				titanic.setSibsp(t.getInteger("sibsp"));
				titanic.setParch(t.getInteger("parch"));
				titanic.setTicket(t.getString("ticket"));
				titanic.setCabin(t.getString("cabin"));
				titanic.setEmbarked(t.getString("embarked"));
				titanic.setName(t.getString("name"));
				titanic.setPassengerid(t.getInteger("passengerid"));
				titanic.setAge(t.getDouble("age").floatValue());
				titanic.setRegdate(new Date());
				
				list.add(titanic);
				
			}
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		return null;
	}

}
