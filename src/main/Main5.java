package main;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// Ŭ������ ��ü�� = new Ŭ������(�غ�);
		Scanner scanner = new Scanner(System.in);
		float a1 = scanner.nextFloat();
		float a2 = scanner.nextFloat();
		float a3 = scanner.nextFloat();
		
		float avg = (a1 + a2 + a3) / 3.0f;
		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		//scanner �ݱ�(�������� �ѹ���)
		scanner.close();
	}

}
