package main;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); //Ű����� ���� �Է�����(13)
		scanner.close();
		
		int i; //�ݺ����� ����
		
		//����2) ���� 1�� �Է� 10
				// 			1 2 3 4 5 6 7 8 9 10
				// ��°�� => 0 0 1 0 0 1 0 0 1 0
				for (i = 1; i <= num; i++) {
					if (i % 3 == 0) {
						System.out.print("1 ");
					} else {
						System.out.print("0 ");
					}
				}

	}

}
