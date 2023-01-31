package main1;
import java.util.Date;

import cls.Item;

public class Main6 {

	public static void main(String[] args) {
		// 1. 물품등록
		Item item = new Item();	
		
		item.setContent("상큼함");
		item.setDate(new Date());
		item.setName("사과");
		item.setNo(100L);
		item.setPrice(10000);
		item.setQuantity(89);
		
		// 2. 20% 할인한 금액으로 자동계산 될 수 있는 기능
		item.disCountPrice(0.2f);
		
		// 3. 재고수량이 100개 미만이면 1000개로 변경시키는 기능
		item.checkQuantity(100);
		
		// 4. 물품내용을 확인
		
		
		
		System.out.println(item.toString()); //현재 저장된 내용확인

	}

}
