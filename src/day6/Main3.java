package day6;
//2023.02.06(3)
public class Main3 {

	public static void main(String[] args) {
		
		ItemDB mDB = new ItemDB();
		//출력
		mDB.printItems();
		
		//int ret = mDB.deleteItem(2);
		//System.out.println(ret);
		
		
		
		// 추가
		/*ItemDB IDB = new ItemDB();
		
		Item item = new Item();
		item.setCode(1);
		item.setName("쿠");
		item.setContent("키");
		item.setPrice(100000000);
		item.setQuantity(33);
		
		int ret = IDB.updateItem(item);
		System.out.println(ret);*/
		
		
		//ItemDB IDB = new ItemDB();
		//Item item = new Item(3, "뭐", "고", 100, 5, new Date());

		//int ret = IDB.insertItem(item);
		//System.out.println(ret);
	}

}
