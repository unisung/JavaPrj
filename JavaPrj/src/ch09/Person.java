package ch09;

public class Person {
	private String name;
	private int age;
	private String info;
	

	public Person(String name, int age, String info) {
		this.setName(name);
		this.setAge(age);
		this.setInfo(info);
	}
	
	public String getDetails() {
		return "이름:"+getName()+",   나이:"+getAge()+",   정보:"+getInfo();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
