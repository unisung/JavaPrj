package ch14;

public class Student {
	int id;
	String tel;
	
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", tel=" + tel + "]";
	}
	

}
