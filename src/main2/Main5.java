package main2;
//2023.02.01(3)
import java.util.Date;

import cls.Course;
import cls.Professor;
import cls.Register;
import cls.Student;

public class Main5 {

	public static void main(String[] args) {
		// Main은 클레스를 테스트하기위한 용도
		// 1.학생등록
			Student student = new Student(1, "가", 5, new Date());
			
		// 2.교수등록.
			Professor professor = new Professor(1, "a", "603", new Date());
			
		// 3.과목등록.
			Course course = new Course();
			course.setCode(4000);
			course.setCredit(3);
			course.setName("java 배우기");
			course.setPreofessor(professor);
			course.setDate(new Date());
			
		// 4.수강신청(1개만)
			Register register = new Register();
			register.setCode(3333);
			register.setCourse(course);
			register.setDate(new Date());
			register.setStudent(student);
			
		// 5.수강신청 내역 출력(1개만)
			System.out.println(register.toString());
			
	}

}
