package ch10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//어노테이션 정의
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
	String value() default ""; //어노테이션 요소
}
//public @interface RequestMapping {
//	String method() default "GET"; //어노테이션 요소
//}


class Myclass{
	//@RequestMapping("/",method=RequestMethod.POST)
	@MyAnnotation(value="Hello")
	public void myMethod() {}
}
