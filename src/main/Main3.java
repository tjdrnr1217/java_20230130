package main;

import java.util.Scanner;

//Ŭ������ ��ġ�� �߰��ϱ� ctrl + Shift + o
public class Main3 {

	public static void main(String[] args) {
		// Ŭ������ ��ü�� = new Ŭ������(�غ�);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �����Է�?");
		int a = sc.nextInt();
		
		System.out.print("�ι��� �����Է�?");
		int b = sc.nextInt();
		
		System.out.print("����° �����Է�?");
		int c = sc.nextInt();
		
		int sum = a + b + c;
		float avg = sum/(float)3; //����) �ݵ�� �Ǽ� ���� 1�� �̻� �ʿ�!!
		
		//����1) ���� 3���� �Է¹޾Ƽ� �հ� ���(�Ҽ���ǥ�õǰ�)
		
		System.out.println("�Է��� ���� ��="+sum);
		System.out.println("�Է��� ���� ���="+avg);
		//�� �������.
		sc.close();
		
		// ������
		int a1 = 13;
		long a2 = 13L;
		
		//�Ǽ���
		float a3 =3.14f;
		//float avg = sum/3.0f;
		double a4 =2.45d;
		
		//������
		char a5 = 'c';
	}

}
