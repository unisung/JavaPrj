package ch09;

public class Student extends Person {

	public Student(String name, int age, String info) {
	     super(name,age,info);
	}

	@Override
	public String getDetails() {
		return "이름:"+getName()+", 나이"+getAge()+", 학번:"+getInfo();
	}
	
	
	
	

}