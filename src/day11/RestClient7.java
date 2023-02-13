package day11;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestClient7 {
	final String URL = "http://1.234.5.158:23000/json/exam7.json";
	private String data = null;

	public RestClient7() {
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

	public void parseData() {
		JSONObject jobj = new JSONObject(this.data);
		String ret = jobj.getString("ret"); // 데이터의 성공유무
		String ret1 = new String("y"); // 실제 데이터


		JSONArray jary = jobj.getJSONArray("data");
		if (ret.equals(ret1)) { // 문자비교는 equals 사용
			for (int i = 0; i < jary.length(); i++) {
				JSONObject jobj1 = jary.getJSONObject(i);

				System.out.println(jobj1.getString("id"));
				System.out.println(jobj1.getString("name"));
				System.out.println(jobj1.getInt("age"));
				System.out.println(jobj1.getFloat("height"));
				System.out.println(jobj1.getFloat("weight"));
				System.out.println("------------------------");
			}
		}

	}
	public List<Member1> parseDate1(){
		List<Member1> list= new ArrayList<Member1>();
		JSONObject jobj = new JSONObject(this.data);
		String ret = jobj.getString("ret"); // 데이터의 성공유무
		String ret1 = new String("y"); // 실제 데이터


		JSONArray jary = jobj.getJSONArray("data");
		if (ret.equals(ret1)) { // 문자비교는 equals 사용
			for (int i = 0; i < jary.length(); i++) {
				JSONObject jobj1 = jary.getJSONObject(i);
				Member1 member = new Member1();
				member.setId(jobj1.getString("id"));
				member.setName(jobj1.getString("name"));
				member.setAge(jobj1.getInt("age"));
				member.setHeight(jobj1.getFloat("height"));
				member.setWeight(jobj1.getFloat("weight"));
				list.add(member);
			}
		}
		
		
		return list;
	}
	
}
