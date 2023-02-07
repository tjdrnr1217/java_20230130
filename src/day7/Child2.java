package day7;
//2023.02.07(1)
public class Child2 extends Parent{

	@Override // 이 메소드는 기능을 재정의 할것임.
	public void work() {
		// 부모의 기능을 다빼고 내가 원하는 기능을 사용했다
		System.out.println("Child2 work"); 
		
	}
	

}
