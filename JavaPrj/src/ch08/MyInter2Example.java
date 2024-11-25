package ch08;

public class MyInter2Example {

	public static void main(String[] args) {
      MyFunction2 fnc1 = new MyFunction2() {
		@Override
		public int sum(int a, int b) {
			int result = a + b;
			return result;
		}
	};
	
	 int res = fnc1.sum(10,20);
	 System.out.println(res);
	 
	 //람다식
	 MyFunction2 fnc2 =  (a, b)-> a + b;
	 res=fnc2.sum(30, 40);
	 System.out.println(res);
	 
	  

	}

}
