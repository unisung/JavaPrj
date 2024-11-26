package ch09;

public class PolyArgumentExample {
	public static void main(String[] args) {
		Student s
		   = new Student("홍길동", 18, "2023001");
		printPersonInfo(s);
		
		Teacher t 
		 = new Teacher("이순신", 25, "Java programming");
		printPersonInfo(t);
		
		Employee e
		 = new Employee("일지매", 23, "교무처");
		printPersonInfo(e);

	}
	
	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {
		 System.out.println("******* Student Info ******");
		 System.out.println(p.getDetails());
		}else if(p instanceof Teacher) {
			 System.out.println("******* Teacher Info ******");
			 System.out.println(p.getDetails());
		}else if(p instanceof Employee) {
			 System.out.println("******* Employee Info ******");
			 System.out.println(p.getDetails());
		}else {
			System.out.println(p.getDetails());
		}
	}

}
