package ch12;

import java.util.HashSet;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		//equivalance
	 //해당객체의 hash코드가 같고, equals메소드 결과가 true	
	 Student student1 = new Student("2024001", "홍길동", 18);
	 Student student2 = new Student("2024001", "홍길동", 18);
	 
	 Set<Student> set = new HashSet<>();
	 //저장
	 set.add(student1);
	 set.add(student2);
	 
	 System.out.println(student1.hashCode());
	 System.out.println(student2.hashCode());
	 
	 boolean result =student1.equals(student2);
	 
	 System.out.println(result);
	 
	 //저장된 객체수
	 System.out.println(set.size());
	 

	}
}
