package main1;

public class Main2 {

	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		int c=4;
		int d=5;
		int e=12;
		
		//�迭�� ��ȣ�� 0���� �����ؼ� 4����(��ü������-1)����
		//�迭�� �ε����� 0����...
		int i;
		int sum=0;
		float avg=0;
		int[] age = {1,2,4,5,12}; // ���� ������ 5�� ����
		for(i=0; i<age.length; i++) {
			System.out.print(age[i]);
		}
		System.out.println();
		
		//����1)age�� ������ �ݴ�� ����ϼ���. 12 5 4 2 1
			for(i=age.length-1; i>=0; i-- ) {
				System.out.print(age[i]+ " ");
			}
			System.out.println();
			for(i=0; i<age.length; i++) {
				System.out.print(age[4-i]+ " ");
			}
			System.out.println();
		//����2) age�� ������ �հ� ��� ���Ͻÿ�.
			for(i=0; i<age.length; i++) {
				sum+=age[i];
			}
			avg=(float)sum/(float)age.length;// �Ǽ� / �Ǽ�
			System.out.print("����="+sum);
			System.out.println();
			System.out.print("�����="+avg);
			System.out.println();
			
		//����3) age 5���߿��� ¦���� ����ϼ���.
			for(i=0;i<age.length; i++) {
				if(age[i]%2 == 0) {
					System.out.print(age[i]+",");
				}
			}
			
	}

}
