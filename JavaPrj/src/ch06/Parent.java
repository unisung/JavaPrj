package ch06;

public class Parent {
	private int a=20;
	public int b=30;
	       void m() {  this.m2();   }
	private void m2() {}
public int getA() {		return a;	}
	public void setA(int a) {		this.a = a;	}
	public int getB() {		return b;	}
	public void setB(int b) {		this.b = b;	}
public static void main(String[] args) {
	Child c = new Child();
	//c.setA(10);
	System.out.println(c.getA());
	System.out.println(c.b);
	//
	c.m();
	//c.m2();
}
}
class Child extends Parent{
	//Child클래스에서 추가한 메소드
	public void m2() {
		super.m();
	}	
}
