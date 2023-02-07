package day7;

import java.util.List;

//2023.02.07(1)
public class Main {

	public static void main(String[] args) {
		//설계도면 객체 = new 구현한클레스의생성자();
		BoardDAO obj = new BoardDAOImpl();
		List<Board> ret = obj.selectBoardHitList(50L);
		System.out.println(ret);
		
		//Board brd = obj.selectBoardHitList(0)
		
//		// 목록으로 전송됨. 목록은 반드시 반복문을 사용해서 1개씩 출력
//		List<Board> list = obj.selectBoardList();
//		
//		for(Board one : list) {
//			System.out.println(one.getBrdno()+ ","+one.getBrdTitle()
//			+","+one.getBrdHit()+","+one.getBrdWriter()
//			+","+one.getBrdDate());
//		}
//		
//		// 배열의 위치를 이요하여 출력하는 방식
//		for(int i=0; i<list.size(); i++) {
//			Board one = list.get(i);
//			System.out.println(one.getBrdno()+ ","+one.getBrdTitle()
//			+","+one.getBrdHit()+","+one.getBrdWriter()
//			+","+one.getBrdDate());
//		}
		
//		Board brd = obj.selectBoardOne(1L);	
//		System.out.println(brd.toString());
		
		
//		int ret = obj.deleteBoard(2);
//		System.out.println(ret);
		
//		Board board = new Board();
//		board.setBrdno(1);
//		board.setBrdTitle("파");
//		board.setBrdWriter("닥");		
//		board.setBrdContent("몬");
//		board.setBrdHit(10);
//		
//		int ret = obj.updateBoard(board);
//		System.out.println(ret);
		
		
//		
//		Board board = new Board ();
//		board.setBrdTitle("제목");
//		board.setBrdContent("내용");
//		board.setBrdWriter("작성자");
//		
//		int ret = obj.insertBoard(board);
//		System.out.println(ret);
//		
		
		

		
//		//배열은 생성시에 반드시 개수가 정해져야 함. ex) 5개
//		int[] a = {2,5,1,23,4}; // 5개의 int형 공간이 생성, 위치는 0부터 4까지
//		int b[] = new int[5]; //5개의 int형 생성됨. 초기화 0으로초기화
//		String[] c = new String[5]; // 5개의 문자타입 생성, 초기화 null
//		
//		b[0] = 12;
//		b[1] = 15;
//		b[2] = 233;
//		
//		// 실직적을 추가된 개수와 상관없음. 생성할때의 개수일 뿐임.
//		System.out.println(b.length); /// 5가 출력됨;
//		
//		// 제너릭형태의 => 객체를 생성하면 타입도 설정할 수 있는 클래스
//		List<Integer> arr = new ArrayList<Integer>();
//		List<String> arr1= new ArrayList<String>();
//		
//		for(int i=0; i<3; i++) {
//			arr.add(10 + i); //10 11 12
//		}
//		arr.size(); // 3이다
		
//		MyListener m1 = new MyInter1();
//		MyListener m2 = new MyInter2();
//		
//		Print p = new Print();
//		p.action(m1);
//		p.action(m2);
		
//		new Frame1();//변수가 필요없을 때는 이렇게한다.
		
//		Parent c2 = new Child2(); //앞쪽에 부모의 타입을 통일해 적어 효율적이게 한다. 
//		c2.work();
//		c2.study();
//		
//		Parent c1 = new Child1();
//		c1.work();
//		c1.study();
		
//		Parent p = new Parent();
//		//메소드는 객체변수.메소드호출()
//		p.work();
//		p.study();

	}

}
