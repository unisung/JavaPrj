package ch05;

public class MyClass {
 //메소드 ㅇver-loading
 void abc(int i, String str) {}// abc(int,String)
 long abc(double i, double str) {return 10;}
 void abc(String str, int i) {}
 void abc(String str) {}
 //long abc(int str, String i) {return 10;}//abc(int,String)

 public int sum(int num1,int num2) {
	 return num1 +num2;
 }
 public int sum(int num1,int num2, int num3) {
	 return num1 +num2+num3;
 }
 public int sum(int num1,int num2, int num3, int num4) {
	 return num1 +num2+num3+num4;
 }
 //메소드명(타입...변수){}
 public int sum(int ... value) {//메소드블럭으로 배열로 전달됨.
	 int s=0;
	 for(int i=0;i<value.length;i++) {
		 s=s+value[i];
	 }
	 return s;
 }
 //int타입의 값을 매개변수로 받아서 평균값을 출력하는 메소드 sum/n
 public double avg(int ... value) {
	 int s=0;
	 for(int i=0;i<value.length;i++) {
		 s=s+value[i];
	 }
	return (double)s/value.length;
 }
 

public static void main(String[] args) {
	MyClass mc = new MyClass();
	mc.abc(10,10);
	
	int result=mc.sum(1,2,3,4,5,6,7,8,9,10);
	System.out.println(result);
}
}
