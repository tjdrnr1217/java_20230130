package day4;
//2023.02.02(1)
import java.util.Date;

public class AddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("a", "a123", "가", "000-0000-0000", "S", new Date());
		Address address = new Address( 5, "부산남구", "45로64", new Date(),member);
		
		System.out.println(address.toString());
		System.out.println(address.invalidcode());
		System.out.println(address.invaliaddress());
		System.out.println(address.invalipostcode());
		System.out.println(address.getYear());
		System.out.println(address.getMonth());
		System.out.println(address.getday());
		
		
		
	
		
	}

}
