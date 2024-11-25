package ch07;

public class A {
  void m1() {System.out.println("hihihi!");}
  void m2(int a) {}
  
public static void main(String[] args) {
	//B타입의 객체 생성
	B b = new B();
	b.m1();//A클래스로부터 상속받음 메소드
	b.m1(10);//B클래스의 메소드
	
	//B타입의 객체를 A타입으로 변환
	A a = b; //upcasting=promtion
	//동적바인딩-컴파일시 메소드 실행부분을 정하지 않고
	//        메소드가 호출실행시 실행부분을 찾아서 실행
	//overring하면 계속 자식메소드가 실행됨.
	a.m1();//A클래스의 메소드
	
//	a.m1(10);//B클래스의 메소드
	
	//A타입으로 변환 객체를 B타입으로 변환
	B b2 = (B)a;
	b2.m1(10);
	
	
}
}

class B extends A{
	//B클래스에서 추가된 m1메소드 오버로딩된거
	void m1(int a) {}
	
	//overriding
	void m1() {System.out.println("hello");}
	void m2(int a) {}
	
	//B클래스에서 추가된 m2메소드 오버로딩된거
	void m2() {}
	double m2(String a) {return 10.0;}
}