package day11;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		RestTitanic titanic = new RestTitanic();
		List<Titanic> list = titanic.parseData();
		int count = 0;
		for(Titanic t : list) {
			System.out.print(t.getAge()+", ");
			System.out.print(t.getCabin()+",");
			System.out.print(t.getEmbarked()+",");
			System.out.print(t.getFare()+",");
			System.out.print(t.getName()+",");
			System.out.print(t.getParch()+",");
			System.out.print(t.getPassengerid()+",");
			System.out.print(t.getPclass()+",");
			System.out.print(t.getSex()+",");
			System.out.print(t.getSibsp()+",");
			System.out.print(t.getSurvived()+",");
			System.out.print(t.getTicket()+",");
			System.out.println();
			System.out.println("-----------------------------------");
			count++;
		}
		System.out.println(count);
		
//		RestClient10 client = new RestClient10();
//		
//		List<Map<String,Object>> list = client.sumStudent();
//		System.out.println(list.toString());
//		for(Map<String, Object> map : list) {
//			System.out.println("아이디=>" + map.get("id"));
//			System.out.println("이름=>" + map.get("name"));
//			System.out.println("총점=>" + map.get("total"));
//			System.out.println("평균=>" + map.get("avg"));
//			System.out.println("------------------------");
//		}
		
	
//		int max = client.maxEng();
//		System.out.println(max);
//		
//		int a[] = client.sumKorMathEng();
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		
//		int n = client.sumKor();
//		System.out.println(n);
		
//		List<Score1> list = client.ParseData1();
//		for(Score1 score1 : list) { // for(한개꺼냈을때타입 m : 리스트변수)
//			System.out.println("id => " + score1.getId());
//			System.out.println("name => " + score1.getName());
//			System.out.println("age => " + score1.getAge());
//			System.out.println("math => " + score1.getMath());
//			System.out.println("eng => " + score1.getEng());
//			System.out.println("kor => " + score1.getKor());
//			System.out.println("----------------------");
//		}
//		
//		RestClient7 client = new RestClient7();
//		client.parseDate1();
//		List<Member1> list = client.parseDate1();
		
//		for(Member1 member : list) { // for(한개꺼냈을때타입 m : 리스트변수)
//			System.out.println("id => " + member.getId());
//			System.out.println("name => " + member.getName());
//			System.out.println("age => " + member.getAge());
//			System.out.println("weight => " + member.getWeight());
//			System.out.println("heught => " + member.getHeight());
//			System.out.println("----------------------");
//		}
		
	}

}
