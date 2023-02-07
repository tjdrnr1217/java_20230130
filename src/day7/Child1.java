package day7;
//2023.02.07(1)
public class Child1 extends Parent {// Parent클레스의 기능을 Child1가 다 가져왔다.

	@Override // 부모의 기능을 재정의 할 것임.
	public void work() {
		// 부모의 work() 메소드를 호출함
		super.work(); // 부모의 기능을 사용함
		System.out.println("child1 work"); // 내가 필요한 기능을 추가
		// 부모의 기능을 먼저 하고 내 기능을 한다.
	}

}
