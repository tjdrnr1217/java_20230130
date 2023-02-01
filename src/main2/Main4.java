package main2;
//2023.02.01(3)
import java.util.Date;

import cls.Course;
import cls.CourseList;
import cls.Professor;


public class Main4 {

	public static void main(String[] args) {
			
		// 1. 교수 생성
		Professor professor = new Professor(3000, "가", "303호", new Date());
		
		// 2. 과목 생성
		Course course = new Course();
		course.setCode(4000);
		course.setCredit(3);
		course.setName("java 배우기");
		course.setDate(new Date());
		course.setPreofessor(professor);
		
		// 3. 과목 등록
		CourseList courselist = new CourseList();
		courselist.insertCourse(course);
		
		// 4. 과목 조회
		courselist.printCoures();
		
		// 5. 등록한 과목의 교수정보를 조회(출력)

	}

}
