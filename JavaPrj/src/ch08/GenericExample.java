package ch08;

public class GenericExample {
	public static void main(String[] args) {
		//컴파일시에 타입이 정적으로 정해짐
		Box2<String> stringBox = new Box2<String>();
		stringBox.setValue("Hello, Java!");
		
		Box2<Integer> intBox = new Box2<Integer>();
		intBox.setValue(42);
		
		String stringValue = stringBox.getValue();
		int intValue = intBox.getValue();
		//타입체킹이 바로됨
		//intBox.setValue("50");
		
		System.out.println(stringValue+" "+intValue);
		
		
	}
}
