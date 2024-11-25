package ch08;
//Generic을 사용하지 않은 코드
public class NonGenericExample {
	public static void main(String[] args) {
		Box1 stringBox = new Box1();
		stringBox.setValue("Hello, Java!");
		
		Box1 intBox = new Box1();
		intBox.setValue(42);//Integer

		String stringValue =(String)stringBox.getValue();
		int intValue = (int)intBox.getValue();
		
		//입력시는 에러안남
		//intBox.setValue("50");//String
		//연산할때 오류발생
		//int intValue2 =(int)intBox.getValue();
		
		System.out.println(stringValue+" "+intValue);
	}
}
