package main;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();		
		int c = scanner.nextInt();
		int num = 5;
		int i = 0; //�ݺ��� �ӽ� ����
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
		//����1) ���� 5�Է� �Ʒ� ó�� ����Ͻÿ�
		// 1 2 3 4 5 4 3 2 1
			for(i=1; i<=a; i++) {
				System.out.print(i);
			}
			for(i=a-1; i>=1; i--) {
				System.out.print(i);
			}
			System.out.println();
		
		
		//����2)���� 13�� �Է��ϸ� 3�� ����� �ձ��ϱ�
		// 3 6 9 12 => 30
		for (i = 1; i <= b; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
			System.out.print("3�� ��� ����="+sum);
			System.out.println();
		
		//����3) ���� 10�� �Է��ϸ� Ȧ���� �� ¦���� �� ���� ���ϱ�
		for (i = 1; i <= c; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else if (i % 3 == 0) {
				sum2 += i;
			}
		}
		System.out.print("¦���� ����=" + sum1);
		System.out.println();
		System.out.print("Ȧ���� ����=" + sum2);
		System.out.println();
		
		
		//����4) ���� 7�� �Է��ϸ� ������ ���ϱ�
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
