package ch09;

public class HeteroCollectionExample {
	public static void main(String[] args) {
	 Person[] arr = new Person[4];
	 arr[0]= new Person("홍길동",20,"20");
	 arr[1]= new Student("일지매",17, "2023001");
	 arr[2]= new Teacher("임꺽정",25, "Java Programming");
	 arr[3]= new Employee("김기동", 30,"교무처");
	 
	 for(int i=0;i<arr.length;i++) {
		 System.out.println(arr[i].getDetails());
	 }
	 

	}

}
