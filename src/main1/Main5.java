package main1;

import java.util.Date;

import cls.Board;

public class Main5 {

	public static void main(String[] args) {
		
		Board board = new Board();
		
		board.setBrdno(7);
		board.setBrdTitle("���� ����ʹ�");
		board.setBrdWriter("�輺��");
		board.setBrdHir(100000);
		board.setBrdContent("���尡��");
		Date date = new Date();
		board.setBrdDate(date);
		
		System.out.println(board.toString());
	
	}

}
