package main2;
//2023.02.01
import java.util.Date;

import cls.Item;

/*정수 타입	byte, short, int, long
문자 타입   char
실수 타입	float, double
논리 타입	boolean



정수 타입 Byte, Short, Integer, Long
문자 타입 Character
실수 타입 Float, Double,
논리 타입 Boolean
문자열 타입 : String
날짜 타입 : Date

Item Board Member
클래스로 만들 수 있는 모든것.. 
*/
public class Main1 {

	public static void main(String[] args) {
		//배열 위치번호 0 부터 4까지..
		int[] a = new int[5]; // 배열이 5개 생성됨. 초기화는 0으로
		int[] b = {1,4,5,2,7}; // 배열이 5개 생성됨. 1,4,5,2,7로 값이 각각 초기화

		String str[] = new String[5]; //문자열 배열 5개 생성됨. 초기값 null로 설정됨.
		int i = 0; //반복문 임시 변수
		for(i=0; i<b.length; i++) { // 0 1 2 3 4 (5x)
			System.out.print(b[i]+ " ");		
		}
		
		Item[] items = new Item[5]; //Item 배열이 5개 생성, 초기값 null로 됨.
		for(i=0; i<items.length; i++) {
			// 클레스명 객체명 = new 생성자명==클레스명();
			Item obj = new Item();
			obj.setNo(i);
			obj.setName("물품명" + i);
			obj.setContent("물품내용" + i);
			obj.setPrice(1000 + i);
			obj.setQuantity(100 + i);
			obj.setDate(new Date());
			
			items[i] = obj;
		}
		for(i=0;i<items.length;i++) {
			System.out.println(items[i].toString());
		}
	}

}
