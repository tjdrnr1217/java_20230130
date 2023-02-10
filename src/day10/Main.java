package day10;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// DB연결과 컬렉션 선택 된 상황
		AddressDB aDB = new AddressDBImpl();
		
		Member member = new Member();
		member.setId("ccc1");
		
		List<Address> list = aDB.selectAddressList(member);
		for(Address address : list) {		
			System.out.println(address.getCode());
			System.out.println(address.getAddress());
			System.out.println(address.getPostcode());
			System.out.println(address.getRegdate());
			System.out.println(address.getMemberid());
			}
			System.out.println("--------------------------------");
		}
		

//		Member member = new Member();
//		member.setId("aa");
//		List<Address> list = aDB.selectAddressList(member);
//		for(Address address : list) {		
//			System.out.println(address.getCode());
//			System.out.println(address.getAddress());
//			System.out.println(address.getPostcode());
//			System.out.println(address.getRegdate());
//			System.out.println(address.getMemberid());
//			}
//			System.out.println("--------------------------------");
//		}
		
//		Address address = new Address();	
//		address.setAddress("부산 사하1");
//		address.setPostcode("111212");
//		address.setRegdate(new Date());
//		
//		Member member = new Member();
//		member.setId("ccc1");
//		address.setMemberid(member); // Member 타입이 들어와야환다
//	
//		int ret = aDB.insertAddress(address);
//		System.out.println(ret);
//		
		
		
		
		
//	MemberDB mDB = new MemberDBImpl();
//		
//		List<Map<String, Object>> list = mDB.selectMemberMapList();
//		for(Map<String, Object> map : list) {
//			System.out.println("아이디 =>" + map.get("_id"));
//			System.out.println("암호 =>" + map.get("password"));
//			System.out.println("이름 =>" + map.get("name"));
//			System.out.println("연락처 =>" + map.get("phonr"));
//			System.out.println("권한 =>" + map.get("role"));
//			System.out.println("등록일 =>" + map.get("regdate"));
//			System.out.println("나이 =>" + map.get("age"));
//			System.out.println("--------------------------------");
//			
//		}
		
		
		// 한개 출력
//		Map<String, Object> map = mDB.selecMemberMapOne("ccc1");
//		System.out.println("아이디 =>" + map.get("_id"));
//		System.out.println("암호 =>" + map.get("password"));
//		System.out.println("이름 =>" + map.get("name"));
//		System.out.println("연락처 =>" + map.get("phonr"));
//		System.out.println("권한 =>" + map.get("role"));
//		System.out.println("등록일 =>" + map.get("regdate"));
//		System.out.println("나이 =>" + map.get("age"));
		
		
		
		//추가
//		Map<String, Object> map = new HashMap<String, Object>(); //키를 반드시 동일화 시켜야한다
//		map.put("_id", "ccc5");
//		map.put("password", "ccc3");
//		map.put("name", "이름3");
//		map.put("phone", 0102);
//		map.put("role", "Q");
//		map.put("age", 19);
//		map.put("regdate", new Date());
//		
//		
//		
//		int ret = mDB.insertMemberMap(map);
//		System.out.println(ret);
//		
		// map실습
//		// 배열과 다른점 : 순차적으로 데이터가 추가 되지 않음.
//		// 키를 통해서 데이터 꺼냄.
//		// 키는 고유해야 함. 같은것은 존재할 수 없음.
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", "adb");
//		map.put("name", "가나다");
//		map.put("age", 21);
//		map.put("name", "나다라"); // 마지막 name으로 교체가 된다.
//		
//		//--------------------------------------------
//		String id = (String)map.get("id"); // 꺼낸 value가 Object이기 때문에 형변환
//		String name = (String)map.get("name");
//		int age = (int)map.get("age");
//		
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(age);

	}



