package ch09;

public class Teacher extends Person {

	public Teacher(String name, int age, String info) {
		super(name, age, info);
	}

	@Override
	public String getDetails() {
		return "이름:"+getName()+", 나이"+getAge()+", 과목:"+getInfo();
	}
	
	

}
