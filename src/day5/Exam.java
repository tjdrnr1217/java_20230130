package day5;
//2023.02.03(2)

// Student, Book
// 제너릭 클래스
// 탑입을 설정한다음에 클래스로 사용하겠다.
// T는 정해저 있지 않음 => T는 누가 정하나?> Main2.java레서 정할 예정
public class Exam<T> {
	
	// 변수 1개
	private T element;
	
	// public 반환타입(public => 외부에서 쓸수 있는 가시성)
	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
}
