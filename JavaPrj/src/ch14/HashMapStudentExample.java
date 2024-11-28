package ch14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapStudentExample {
	public static void main(String[] args) {
		Map<String, Student> map
		= new HashMap<>();
		
		map.put("홍길동", new Student(1, "010-111-1234"));
		map.put("일지매", new Student(2, "010-111-5678"));
		map.put("임꺽정", new Student(3, "010-111-1919"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름:?");
			String name = scanner.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student student = map.get(name);
			if(student==null) {
				System.out.println(name+"은 없습니다.");
			}
			else {
				System.out.println(student);
			}
		}

	}
}
