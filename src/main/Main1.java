package main;

public class Main1 {
	//주석문 설명 적는것
	//클레스명 첫번째 문자 대문자 ex) Student Car StudentClass
	//변수명 소문자 ex) car student studentAge
	//메소드(함수) ex) printMyaAge()
	//class 두 개사용 String, System
	
	public static void main(String[] args) {
		// 타입 변수명 = 초기값
		//byte, short, int(32bit), long(64bit) => 정수
		//char => 문자
		//float, double => 실수
		//boolean => true/false
		int a = 15;
		int b = 16;
		
		System.out.println(a+b); //더하기
		System.out.println(a-b); //빼기
		System.out.println(a*b); //곱하기
		// 나누기 ( 정수 / 정수  => 정수)
		// 정수 / 실수 => 실수
		System.out.println(a/b); //나누기(몫)
		System.out.println(a%b); //나머지(나머지)
		
		//문제1) int a = 124; 일경우 각 자리수의 합을 구하시오.(100~999)
		//ex) 124 => 7
		//ex) 235 => 10
		 int c = 124;
		 
		 int c1 = c%10;
		 int c2 = c/10%10;
		 int c3 = c/100;
		 	 
		 System.out.println(c1+c2+c3);
		 
		 //문제2) 1000~9999의 숫자를 뒤집어서 출력하시오.
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
