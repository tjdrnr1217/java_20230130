package main1;

public class Main2 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 4;
		int d = 5;
		int e = 12;

		// 배열의 번호는 0부터 시작해서 4까지(전체개수의-1)까지
		// 배열의 인덱스는 0부터...
		int i;
		int sum = 0;
		float avg = 0;
		int[] age = { 1, 2, 4, 5, 12 }; // 나이 변수가 5개 생성
		for (i = 0; i < age.length; i++) {
			System.out.print(age[i]);
		}
		System.out.println();

		// 문제1)age의 값들을 반대로 출력하세요. 12 5 4 2 1
		for (i = age.length - 1; i >= 0; i--) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		for (i = 0; i < age.length; i++) {
			System.out.print(age[4 - i] + " ");
		}
		System.out.println();
		// 문제2) age의 값들을 합과 평균 구하시오.
		for (i = 0; i < age.length; i++) {
			sum += age[i];
		}
		avg = (float) sum / (float) age.length;// 실수 / 실수
		System.out.print("합은=" + sum);
		System.out.println();
		System.out.print("평균은=" + avg);
		System.out.println();

		// 문제3) age 5개중에서 짝수만 출력하세요.
		for (i = 0; i < age.length; i++) {
			if (age[i] % 2 == 0) {
				System.out.print(age[i] + ",");
			}
		}

	}

}