package day4;
//2023.02.02(1)
import java.util.Date;

public class ItemMain {

	public static void main(String[] args) {
		Item item = new Item(12, "java", "123456789012345678901234567890", 5000, 0, new Date(), "호식이");
		
		System.out.println(item.toString());
		System.out.println("바뀐수량="+item.invalidquantity(30));
		System.out.println("할인금액은="+item.invalidprice(0.2f));
		System.out.println("총금액은="+item.total());
		item.invalidcontent();
		item.invalidname();
		System.out.println(item.revName());
		System.out.println(item.toString());
	}

}
