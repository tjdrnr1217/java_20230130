package day6;

public class Main2 {

	public static void main(String[] args) {
		
		Exam2 obj1 = new Exam2();
		obj1.plusAge(); // age=>1
		obj1.plusAge(); // age=>2	
		obj1.plusAge(); // age=>3	
		//obj1.printAge(); 
		obj1.forAge();
		
		//Exam2 obj2 = new Exam2();
		//obj2.plusAge(); // age => 1
		//obj2.printAge();
		
		//static은 객체를 생성하지 않는다
		//Exam2.plusAge1(); // age => 101
		//Exam2.plusAge1(); // age => 102
		
			
	}

}
