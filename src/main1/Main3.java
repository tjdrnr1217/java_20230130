package main1;


//���ڿ�
public class Main3 {
	public static void main(String[] args) {
		
		//import���Ϲ� java.lang.*
		//Ŭ������ ��ü�� = new  Ŭ������(�غ�)
		String str = new String("hello world");
		String str1 = "hello world";
		
		//ret[0] = hello
		//ret[1] = world
		String[] ret = str.split(" "); //���ϴ� ���� ���ڷ� �����ϱ� 
		System.out.println(ret[0]);
		System.out.println(ret[1]);
		
		System.out.println(str);
		System.out.println(str1);
		// String Ŭ������ ����߿��� substring�� ����� ���
		System.out.println(str.substring(0,3)); // hel(3�� �������� �ʴ´�)
		

	}

}
