package main1;

import java.util.Date;

import cls.Board;

public class Main5 {

	public static void main(String[] args) {
		// 1.객체 생성
		Board board = new Board();
		
		// 2.객체를 기반으로 메소드를 사용해서 적절한 일을 수행
		board.setBrdno(7);
		board.setBrdTitle("집에 가고싶다");
		board.setBrdWriter("김성국");
		board.setBrdHir(100000);
		board.setBrdContent("당장가자");
		Date date = new Date();
		board.setBrdDate(date);
		//2번째 방법 board.setBrdDate( new Date () );
		
		// 3. toString을 호출해서 현재의 값을 출력 
		System.out.println(board.toString());
	
	}

}
