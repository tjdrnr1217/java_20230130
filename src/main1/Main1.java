package main1;

public class Main1 {

	public static void main(String[] args) {
		//����Ÿ��
		// ������ : byte, short, int, long
		// �Ǽ��� : float, double
		// ������ : char
		// ���� : boolean
		
		// Ŭ������
		// ������ : Byte, Short, Integer, Long => Ŭ������ ����� ���� ��
		// String �ҹ��ڷ� �Ǿ��ִ°� ����Ÿ���̴�
		
		//���� ���ϴ� Ÿ���� ����.
		int age = 13;
		//char[] = {'h','o','n','g'};
		//if(����) age == 50, age != 50, age >= 50, age <= 50
		//if(���� && ����) && and || or ! not
		if (age >= 50) {
			System.out.println("50���� ũ�ų� �����ϴ�.");
		} else {
			System.out.println("50���� �۽��ϴ�.");
		}
		
		//for,while,do while
		int i=0; //�ݺ��� �ӽ� ����
		for(i=1; i<=5; i++) { // 1 2 3 4 5 6(x)
			System.out.print(i+ " ");
			// 1 2 3 4 5
		}
		
		for(i=1; i<=1000; i++) { // 1 2 3 ....... 1000 1001(x)
			if(i>=10) {
				//�ݺ����� ������ �����Ŵ
				//break; �� ��������
				break; //10�϶� ����� 11���ʹ� ������� �ʴ´�.
			}
		}
		// 1~10���� Ȧ���� ����� ��
		for(i=1; i<=10;i++) {
			if(i%2==0) { // ¦���� ��쿡
				continue; // ����ġ�� �������� �Ʒ� �ҽ��ڵ�� ������� ����
			}
			System.out.print(i);
		}
	}

}
