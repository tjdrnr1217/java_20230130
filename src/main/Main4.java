package main;

import java.util.Scanner;

// ctrl + shift + f
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 숫자입력?");
		int a = sc.nextInt();

		// = => 값을 넣음
		// == => 같으냐?
		// !== => 같지 않느냐?
		/*
		 * if (a % 5 == 0) { System.out.println("입력한 값은 5의배수"); } else {
		 * System.out.println("입력한 값은 5의배수 아님"); }
		 */

		/*
		 * 100~90 A 90 <= a변수 a의 변수 <=100 89~80 B 79~70 C 나머지 D
		 */
		/*
		 * if (90 <= a && a <= 100) { System.out.println("A"); } else if (80 <= a && a
		 * <= 89) { System.out.println("B"); } else if (70 <= a && a <= 79) {
		 * System.out.println("C"); } else { System.out.println("D"); }
		 */

		// 문제1) 입력받은 숫자 a가 짝수 인지 홀수 인지 확인
		// 문제2) 입력받은 숫자가 3, 5, 3 5인지 확인
		// ex) 15 => 3 5
		// ex) 5 => 5

		if (a % 2 == 1) {
			System.out.println(a + "은 홀수 입니다");
		} else {
			System.out.println(a + "은 짝수 입니다");
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
