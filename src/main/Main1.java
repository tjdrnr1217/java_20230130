package main;

public class Main1 {
	//�ּ��� ���� ���°�
	//Ŭ������ ù��° ���� �빮�� ex) Student Car StudentClass
	//������ �ҹ��� ex) car student studentAge
	//�޼ҵ�(�Լ�) ex) printMyaAge()
	//class �� ����� String, System
	
	public static void main(String[] args) {
		// Ÿ�� ������ = �ʱⰪ
		//byte, short, int(32bit), long(64bit) => ����
		//char => ����
		//float, double => �Ǽ�
		//boolean => true/false
		int a = 15;
		int b = 16;
		
		System.out.println(a+b); //���ϱ�
		System.out.println(a-b); //����
		System.out.println(a*b); //���ϱ�
		// ������ ( ���� / ����  => ����)
		// ���� / �Ǽ� => �Ǽ�
		System.out.println(a/b); //������(��)
		System.out.println(a%b); //������(������)
		
		//����1) int a = 124; �ϰ�� �� �ڸ����� ���� ���Ͻÿ�.(100~999)
		//ex) 124 => 7
		//ex) 235 => 10
		 int c = 124;
		 
		 int c1 = c%10;
		 int c2 = c/10%10;
		 int c3 = c/100;
		 	 
		 System.out.println(c1+c2+c3);
		 
		 //����2) 1000~9999�� ���ڸ� ����� ����Ͻÿ�.
		 //ex) 2451 => 1542
		 
		 int d = 2451;
		 int d1 = d%10; //1
		 int d2 = d/10%10;//5
		 int d3 = d/100%10;//4
		 int d4 = d/1000;//2
		 
		 int sum = d1*1000+d2*100+d3*10+d4;
		 
		 System.out.println(sum);
 	}

}
