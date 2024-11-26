package ch09;

public class Employee extends Person {
	public Employee(String name, int age, String info) {
		super(name, age, info);
	}

	@Override
	public String getDetails() {
		return "이름:"+getName()+", 나이"+getAge()+", 부서:"+getInfo();
	}

}
