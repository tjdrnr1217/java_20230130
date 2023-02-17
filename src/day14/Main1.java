package day14;

import java.util.Date;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		BoardDB bdb = new BoardDBImpl();
		Board b = new Board();

//		List<Board> list = bdb.selectBoardList(2);
//		for (Board ba : list) {
//			System.out.println(ba.getBrdno());
//			System.out.println(ba.getBrdTitle());
//			System.out.println(ba.getBrdContent());
//			System.out.println(ba.getBrdWriter());
//			System.out.println(ba.getBrdHit());
//			System.out.println(ba.getBrdDate());
//			System.out.println("-------------------");
//		}

		// 하나만 출력
//		Board b = bdb.selectBoardOne(3L);
//		System.out.println(b.getBrdno());
//		System.out.println(b.getBrdTitle());
//		System.out.println(b.getBrdContent());	
//		System.out.println(b.getBrdWriter());
//		System.out.println(b.getBrdHit());
//		System.out.println(b.getBrdDate());

		// 수정
//		b.setBrdno(8);
//		b.setBrdContent("바");
//		b.setBrdTitle("하");
//		int ret = bdb.updateBoardOne(b);
//		System.out.println(ret);

		// 삭제
//		bdb.deleteBoardOne(7L);

		// 추가
		b.setBrdTitle("쿠쿠");
		b.setBrdContent("하세요");
		b.setBrdWriter("쿠쿠");
		b.setBrdHit(500);
		b.setBrdDate(new Date());
		
		int ret = bdb.insertBoardOne(b);
		System.out.println(ret);
		

	}

}
