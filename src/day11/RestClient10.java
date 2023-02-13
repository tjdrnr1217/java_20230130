package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestClient10 {
	final String URL = "http://1.234.5.158:23000/json/exam10.json";
	private String data = null;

	public RestClient10() {
		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(URL).get().build();
			Response response = client.newCall(request).execute();

			if (response.isSuccessful() == true) {
				this.data = response.body().string().toString();
				System.out.println(this.data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void parseDate() {
		JSONObject jobj = new JSONObject(this.data);
		String ret = jobj.getString("ret"); // ret 값
		JSONArray jary = jobj.getJSONArray("data"); // date목록

		// [{0},{1},{2},{3},{4}]
		for (int i = 0; i < jary.length(); i++) {
			JSONObject jobj1 = jary.getJSONObject(i); // item 목록 개수
			String id = jobj1.getString("id");
			String name = jobj1.getString("name");
			int age = jobj1.getInt("age");

			//score가져오기 {"math" : 50, "eng":90, "kor":69}
			JSONObject score = jobj1.getJSONObject("score");
			int math = score.getInt("math");
			int eng = score.getInt("eng");
			int kor = score.getInt("kor");

			System.out.println(id + "," +name+ "," +age+ "," +math+ "," +eng+ "," +kor);
		}
	}

	public List<Score1> ParseData1() {
		JSONObject jobj = new JSONObject(this.data);
		String ret = jobj.getString("ret"); 
		String ret1 = new String("y"); 
		// 반환 객체 만들기
		
		List<Score1> list = new ArrayList<Score1>();
		
		JSONArray jary = jobj.getJSONArray("data");
		
		// 실제 저장된 객체에서 Score1객체로 1개씩 복사
		if(ret.equals(ret1)) {
		for (int i = 0; i <jary.length(); i++) {
			JSONObject jobj1 = jary.getJSONObject(i);
			Score1 s1 = new Score1();
			s1.setId(jobj1.getString("id"));
			s1.setName(jobj1.getString("name"));
			s1.setAge(jobj1.getInt("age"));
			
			JSONObject score = jobj1.getJSONObject("score");
			s1.setMath(score.getInt("math"));
			s1.setEng(score.getInt("eng"));
			s1.setKor(score.getInt("kor"));
			

			// 반환활 객체에 Score1객체 추가
			list.add(s1);
			
				
			}
		}
	
		return list;
	}
	// 국어점수 합계 구하기
	public int sumKor() {
		List<Score1> list = this.ParseData1();
		int sum = 0;
		for(Score1 s1 : list) {
			int n = s1.getKor();
			sum += n;
		}
		return sum;
	}
	
	// 영어점수 최대값 구하기
	public int maxEng() {
		List<Score1> list = this.ParseData1();
		int max = 0; // 초기값을 범위 값보다 작은것으로
		for(Score1 s1 : list) {
			if(max < s1.getEng()) {
				max = s1.getEng();
			}
		
		}
		return max;
	}
	
	
	// 국어, 영어, 수학 합계 구하기
	public int[] sumKorMathEng() {
		List<Score1> list = this.ParseData1();
		int[] a = new int[3];
		// int [] ret1 = {0,0,0};
		for(Score1 s1 : list) {// list 5개 그 중에 하나(1)를 꺼내서 s1에 넣는다(반복)
		a[0] += s1.getKor();
		a[1] += s1.getEng();
		a[2] += s1.getMath();
			
	}
	return a;
	// r
	}
	
	// 학생병 총점 구하기
	// map에는 학생아이디, 총점정보를 포함하기
	public List<Map<String,Object>> sumStudent(){
		// 점수를 가지고 있음 5개
		
		// 1. 반환타입 만들기 (Map은 클레스와 같음.)
		List<Score1> list = this.ParseData1();
		List<Map<String,Object>> retList = new ArrayList<>();
		for(Score1 s1 : list) {
			//2. 반환타입에 포함하는 Map만들기
			Map<String,Object> map = new HashMap<>();
			map.put("id",s1.getId());
			map.put("name",s1.getName());
			map.put("total",s1.getKor()+s1.getEng()+s1.getMath());
			map.put("avg",(float)(s1.getKor()+s1.getEng()+s1.getMath()) / 3);
			
			
			// 3/ list에 추가하기
			retList.add(map);
			
		}
		return retList;
	}

}
