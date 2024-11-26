package ch10;

import java.lang.reflect.Method;

public class MyAnnotationExample {
	public static void main(String[] args) 
		throws NoSuchMethodException, SecurityException {
		//MyClass에서 메소드 정보 추출
		Method method 
		  = Myclass.class.getMethod("myMethod");
		
		//추출한 메소드 정보에서 annotation정보 추출
		MyAnnotation annotation =
				method.getAnnotation(MyAnnotation.class);
		//추출한 어노테이션에 값 추출
		String value = annotation.value();
		System.out.println("@MyAnnotion value:" + value);
		
	}
}
