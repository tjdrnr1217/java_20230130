package day11;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestTitanic {
	final String URL = "https://raw.githubusercontent.com/AISPUBLISHING/dsfs-python/master/titanic.json";
	private String data = null;

	public RestTitanic() {
		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(URL).get().build();
			Response response = client.newCall(request).execute();

			if (response.isSuccessful() == true) {
				this.data = response.body().string().toString();
				System.out.println("확인용 =>" + this.data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Titanic> parseData() {
		List<Titanic> list = new ArrayList<>();
		JSONArray jary = new JSONArray(this.data);
		for (int i = 0; i < jary.length(); i++) {
			Titanic titanic = new Titanic();
			JSONObject jobj = jary.getJSONObject(i).getJSONObject("fields");

			titanic.setFare(jobj.getFloat("fare"));
			titanic.setName(jobj.getString("name"));

			if (jobj.isNull("survived"))
				titanic.setSurvived("_");
			else
				titanic.setSurvived(jobj.getString("survived"));

			if (jobj.isNull("age"))
				titanic.setAge(0.0f);
			else
				titanic.setAge(jobj.getFloat("age"));

			if (jobj.isNull("cabin"))
				titanic.setCabin("_");
			else
				titanic.setCabin(jobj.getString("cabin"));

			if (jobj.isNull("parch"))
				titanic.setParch(0);
			else
				titanic.setParch(jobj.getInt("parch"));

			if (jobj.isNull("pclass"))
				titanic.setPclass(0);
			else
				titanic.setPclass(jobj.getInt("pclass"));

			if (jobj.isNull("sex"))
				titanic.setSex("_");
			else
				titanic.setSex(jobj.getString("sex"));

			if (jobj.isNull("passengerid"))
				titanic.setPassengerid(0);
			else
				titanic.setPassengerid(jobj.getInt("passengerid"));

			if (jobj.isNull("embarked"))
				titanic.setEmbarked("_");
			else
				titanic.setEmbarked(jobj.getString("embarked"));

			if (jobj.isNull("ticket"))
				titanic.setTicket("_");
			else
				titanic.setTicket(jobj.getString("ticket"));

			if (jobj.isNull("sibsp"))
				titanic.setSibsp(0);
			else
				titanic.setSibsp(jobj.getInt("sibsp"));

			list.add(titanic);

		}

		return list;
	}

	public void saveMongodDB() {
		
	}

}
