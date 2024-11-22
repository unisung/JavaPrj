package ch05;

public class CastingExam {
	public static void main(String[] args) {
	//형변환 int -> float, double -> int, long
	  int i =10;//정수에서 기본타입은 int
	  byte b=10; //int -> byte
	  char c=10; //int -> char
	  short s=10;//int -> short
	  
	  long l = 10;
	  
	  float f=5.5f; //단정도, 배정도
	  double d =5.5;//자바에서실수의 기본타입은 double로
	  System.out.println(i);
	  System.out.println(f);
	  
	  int a =(int)f;//캐스팅-형변환
	  System.out.println(a);
	  
	  double dd = i;//캐스팅-형변환	  
	  System.out.println(dd);
	  
	  A aa = new B();//upcasting(promotion)
	  B bb = (B)aa; //downcasting
	  
	  //문법상 오류는 아님.
	  //C cc = (C)new A();//처음부터 부모객체 생성해서 자식타입변수에 대입하면 오류
	  
	  B bbb = new D();
	  A aaa = bbb;
	  B bbbb = (B)aaa;
	  D ddd = (D)bbbb;
	  //오류
	  C ccc = new E();
	  A aaaa = ccc;
	  B bbbbb = (B)aaaa;
	  D dddd  = (D)bbbbb;
	  
	  
	}
}
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
