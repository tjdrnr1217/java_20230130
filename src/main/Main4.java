package main;

import java.util.Scanner;

// ctrl + shift + f
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� �����Է�?");
		int a = sc.nextInt();

		// = => ���� ����
		// == => ������?
		// !== => ���� �ʴ���?
		/*
		 * if (a % 5 == 0) { System.out.println("�Է��� ���� 5�ǹ��"); } else {
		 * System.out.println("�Է��� ���� 5�ǹ�� �ƴ�"); }
		 */

		/*
		 * 100~90 A 90 <= a���� a�� ���� <=100 89~80 B 79~70 C ������ D
		 */
		/*
		 * if (90 <= a && a <= 100) { System.out.println("A"); } else if (80 <= a && a
		 * <= 89) { System.out.println("B"); } else if (70 <= a && a <= 79) {
		 * System.out.println("C"); } else { System.out.println("D"); }
		 */

		// ����1) �Է¹��� ���� a�� ¦�� ���� Ȧ�� ���� Ȯ��
		// ����2) �Է¹��� ���ڰ� 3, 5, 3 5���� Ȯ��
		// ex) 15 => 3 5
		// ex) 5 => 5

		if (a % 2 == 1) {
			System.out.println(a + "�� Ȧ�� �Դϴ�");
		} else {
			System.out.println(a + "�� ¦�� �Դϴ�");
		}

		if (a % 3 == 0 && a%5 == 0) {
			System.out.println("3 ,5");
		} else if (a % 3 == 0) {
			System.out.println("3");
		} else if (a % 5 == 0) {
			System.out.print("5");
		}
		sc.close();
	}

}
