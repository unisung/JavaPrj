package ch08;

public class MyInterExample {
	public static void main(String[] args) {
	//MyFunction myfnc1 = new MyFunction();
		//인터페이스는 구현체인 자식클래스를 생성하여
		//인터페이스타입으로 대입하여 사용(promotion)
		MyFunction myfnc1 = new MyFunctionImpl();
		String s=myfnc1.m1("hiroo");
		System.out.println(s);
		
		//무명인터페이스 선언
		MyFunction myfnc2 = new MyFunction(){//promotion
			//무명 구현체에서 override된 메소드
			@Override
			public String m1(String s) {
				return "hihihi!";
			}
			//무명 구현체에서 추가된 메소드
			public void m2() {
				System.out.println("bye");
			}
		};
		
		s = myfnc2.m1("hi");
		System.out.println(s);
		//자식객체(구현체)에서 추가된 메소드이므로 
		// MyFunction타입으로 promotion이 이루어전 후라 접근불가
		//myfnc2.m2();
		
		//람다식으로 무명인터페이스 대체
		MyFunction myfnc3 = k-> "Ok";
		
		s=myfnc3.m1("aaa");
		System.out.println(s);
		
		
		
		
	}
	
}
