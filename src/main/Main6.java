package main;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); //Ű����� ���� �Է�����(13)
		int num1 = scanner.nextInt(); //Ű����� ���� �Է�����(13)
		scanner.close();
		
		int i; //�ݺ����� ����
		
		//����1) �ΰ��� ���ڸ� �Է¹޾Ƽ� ���� ��ŭ ���
		//ex) 3 7 => 3 4 5 6 7
		//ex) 8 2 => 2 3 4 5 6 7 8
		
		if (num <= num1) {
			for (i = num; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else if (num >= num1) {
			for (i = num1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println(); 
		

		
		// i++ => = i + 1
		// i+2= => = i + 2
		//for(�ӽú���=�ʱⰪ; �ӽú����� �̿��� ����; �ӽú����� ��ȭ(1������) )
		
		/*for(i = 1; i<=num; i+=2) {
			System.out.print(i+",");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		for(i=num; i>=1; i--) {
			System.out.print(i+",");
		}*/
		
		//�� ��ġ�� i����?4
		
	}

}
