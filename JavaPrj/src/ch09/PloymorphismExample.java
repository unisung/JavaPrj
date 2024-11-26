package ch09;

public class PloymorphismExample {
	public static void main(String[] args) {
      Person p;
      
      p = new Student("홍길동", 18, "20240001");
      System.out.println(p.getDetails());
		
      p = new Teacher("이순신", 23, "Java programming");
      System.out.println(p.getDetails());
		
      p = new Employee("일지매", 22, "교무처");
      System.out.println(p.getDetails());

	}
}
