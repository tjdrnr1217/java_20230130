package main;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();		
		int c = scanner.nextInt();
		int num = 5;
		int i = 0; //반복문 임시 변수
		int j = 0;
		int sum=0;
		int sum1=0;
		int sum2 = 0;
		/*for(i=1; i<=5; i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1; i<=num; i++) {
			for(j=num; j>=i;j--) { //2) for(j=1; j<=(6-i); j++)
				System.out.print("*");
			}
			 System.out.println();
		}*/
		
		/*for(i=1;i<=5;i++) { // 1 2 3 4 5
			for(j=1; j<=(i*2)-1; j++) {// 1 123 12345 1234567 123456789
				System.out.print("*");
			}
			System.out.println();
		}*/
		//문제1) 숫자 5입력 아래 처럼 출력하시오
		// 1 2 3 4 5 4 3 2 1
			for(i=1; i<=a; i++) {
				System.out.print(i);
			}
			for(i=a-1; i>=1; i--) {
				System.out.print(i);
			}
			System.out.println();
		
		
		//문제2)숫자 13을 입력하면 3의 배수의 합구하기
		// 3 6 9 12 => 30
		for (i = 1; i <= b; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
			System.out.print("3의 배수 합은="+sum);
			System.out.println();
		
		//문제3) 숫자 10을 입력하면 홀수의 합 짝수의 합 각각 구하기
		for (i = 1; i <= c; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else if (i % 3 == 0) {
				sum2 += i;
			}
		}
		System.out.print("짝수의 합은=" + sum1);
		System.out.println();
		System.out.print("홀수의 합은=" + sum2);
		System.out.println();
		
		
		//문제4) 숫자 7을 입력하면 구구단 구하기
		//7*1=7
		//7*2=14
		for(i=1; i<=9 ;i++) {
			System.out.println("7 * " + i + "=" + (7*i));
		}
		
		for(i=1;i<=9;i++ ) {
			for(j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}

}
