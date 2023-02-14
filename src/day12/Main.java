package day12;

import java.util.List;

import day11.Titanic;

public class Main {

	public static void main(String[] args) {
//		RestTitanic obj = new RestTitanic();
//		obj.saveMongodDB();

		TitanicDB titanicDB = new TitanicDBImpl();
		Print print = new Print();
		print.printAgeSurvived(titanicDB.selecTitanicList());
		
		
		
//		print.printPClassSurvived(titanicDB.selecTitanicList());
//				
//		print.printSexSurvived(titanicDB.selecTitanicList());
	
		
//		int a[] = print.printPClass(titanicDB.selecTitanicList());
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);

//		List<Titanic> list = titanicDB.selecTitanicList();

//		List<Map<String,Object>> list = titanicDB.selectTitanicListMap();
//		for(Map<String,Object> map : list) {
//			System.out.println(map.get("fare"));
//			System.out.println(map.get("survived"));
//			System.out.println(map.get("pclass"));
//			System.out.println(map.get("sex"));
//			System.out.println(map.get("sibsp"));
//			System.out.println(map.get("parch"));
//			System.out.println(map.get("ticket"));
//			System.out.println(map.get("cabin"));
//			System.out.println(map.get("embarked"));
//			System.out.println(map.get("name"));
//			System.out.println(map.get("passengerid"));
//			System.out.println(map.get("age"));
//			System.out.println(map.get("regdate"));
//			System.out.println("-----------------------");
//		}

//		for(Titanic titanic : list) {
//			System.out.println(titanic.getFare());
//			System.out.println(titanic.getSurvived());
//			System.out.println(titanic.getPclass());
//			System.out.println(titanic.getSex());
//			System.out.println(titanic.getSibsp());
//			System.out.println(titanic.getParch());
//			System.out.println(titanic.getTicket());
//			System.out.println(titanic.getCabin());
//			System.out.println(titanic.getEmbarked());
//			System.out.println(titanic.getName());
//			System.out.println(titanic.getPassengerid());
//			System.out.println(titanic.getAge());
//			System.out.println(titanic.getRegdate());
//			System.out.println("-------------------------");
//			
//		}

//		for(Titanic titanic : list) {
//			System.out.println(titanic.getFare());
//			System.out.println(titanic.getSurvived());
//			System.out.println(titanic.getPclass());
//			System.out.println(titanic.getSex());
//			System.out.println(titanic.getSibsp());
//			System.out.println(titanic.getParch());
//			System.out.println(titanic.getTicket());
//			System.out.println(titanic.getCabin());
//			System.out.println(titanic.getEmbarked());
//			System.out.println(titanic.getName());
//			System.out.println(titanic.getPassengerid());
//			System.out.println(titanic.getAge());
//			System.out.println(titanic.getRegdate());
//			System.out.println("-------------------------");
//			
//		}

	}

}
