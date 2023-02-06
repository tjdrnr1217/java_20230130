package day6;
//2023.02.06(1)금요일거 복습

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Exam1 {
	
	//클레스의 변수
	private int age = 1;

	// 생성자 => Main에서 클래스를 생성할때 초기값으로 세팅용.
	public Exam1() {
		super();
	}

	public Exam1(int age) { //외부에서 들어오는 age
		super();
		this.age = age;
	}
	
	// 메소드, getter setter, toString도 메소드
	//메소드(public, return type, 메소드명(외부로부터 넘겨받는 값 == 파라미터){ 생성
	//내부에 있는 변수는 내부에서만 쓸수있다
	public void printAge() {
		int age1 = 15;
		System.out.println(this.age*2);
		
	}

	
	
}
