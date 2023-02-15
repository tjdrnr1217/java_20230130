package day13;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		ItemDB iDB = new ItemDBImpl();
		List<Item> list = iDB.selectItemList(5);
//		for (Item item : list) {
//
//			System.out.println("번호:" + item.getNo());
//			System.out.println("물품명:" + item.getName());
//			System.out.println("물품설명:" + item.getContent());
//			System.out.println("물품수량:" + item.getQuantity());
//			System.out.println("물품가격:" + item.getPrice());
//			System.out.println("날짜:" + item.getRegdate());
//			System.out.println("------------------------");
//		}

		// 문제1) 가격대별 수량 구하기
		// 1~999 => 1개
		// 1000 ~ 9999 => 1개
		// 10000 ~ 99999 => 1개
		// 100000원 이상 1개
		int [] a = new int[12];
		for(Item item : list) {
			if(item.getPrice()<= 999) {
				a[0]++;
			}else if(item.getPrice()>=1000 && item.getPrice() <= 9999) {
				a[1]++;
			}else if(item.getPrice()>=10000 && item.getPrice() <= 99999) {
				a[2]++;
			}else {
				a[3]++;
			}				
		}
		System.out.println("1~999개수:"+a[0]);
		System.out.println("1000~9999개수:"+a[1]);
		System.out.println("100000~99999개수:"+a[2]);
		System.out.println("100000이상:"+a[3]);

		// 문제2) 시간대별 재고수량 합계
		// 0시 => 1개
		// 1시 => 2개
		// ~~~~
		// 23시 =>1새

		int[] b = new int[25];
		for (Item item : list) {
			SimpleDateFormat dateformat = new SimpleDateFormat("HH");
			String h = dateformat.format(item.getRegdate());
			int n = Integer.parseInt(h);
			b[n]++;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(i + "시: " + b[i]);
		}

		// 문제3) 재고수량이 1000이상인것만 3자리 콤마 추가 후 출력(int to String으로 변환)
		// ex) 물품번호, 이름, 가격, 재고수량
		// 1001, 가나다, 300, 12,343,343
		DecimalFormat decFormat = new DecimalFormat("###,###");
		for(Item item : list) {
			if(item.getQuantity() >= 1000) {
				String q = decFormat.format(item.getQuantity());
				System.out.println("물품번호:"+item.getNo());
				System.out.println("이름:"+item.getName());
				System.out.println("가격:"+item.getPrice());
				System.out.println("재고수량:"+q);
				System.out.println("-------------------");
			}
		}
		

//		Item item = new Item();
//		item.setNo(2);
//		item.setName("집");
//		item.setContent("에");
//		item.setPrice(4);
//		item.setQuantity(8);
//		
//		int ret = iDB.updateItemOne(item);
//		System.out.println(ret);

//		long no[] = new long[3];
//		for(int i = 0; i<3; i++) {
//			no[i]= 281+i;
//		}
//		int ret = iDB.deleteItemMany(no);
//		System.out.println(ret);

	}

}
