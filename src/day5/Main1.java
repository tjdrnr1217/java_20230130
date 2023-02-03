package day5;
//2023.02.03(1)
public class Main1 {

	public static void main(String[] args) {
		//프로그램이 실행될때 static메소드가 있는 클레스는 자동적으로 1개의 객체를 생성.
		int ret = Calc.sumMul(3, 4); //static을 사용했을때 객체를 생성하지 않아도 된다 자동적으로 1개의 객체가 생성된다.
		System.out.println(ret);
		
		
		
		
		// 객체 생성(생성자가 호출됨)
		//Calc calc = new Calc(); //메모리,자원 사용
		//int ret = calc.sumMul(3, 4);
		//System.out.println(ret);
		
		//int ret = calc.sumPlus(1, 2);

	/*	int ret;
		try {
			ret = calc.sumMinus(10, 5);
			System.out.println(ret);
		} catch (Exception e) {
			e.printStackTrace();
		}//오류가 발생하는 이유는 throws Exception때문이다.
*/
		// float ret = calc.sumDiv(10, 0);
		// System.out.println(ret);

		// int ret = calc.sumPlus(3, 4);
		// System.out.println(ret);
	}

}
