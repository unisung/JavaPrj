package ch08;

//인터페이스에는 생성자가 없음
public interface MyFunction {
  public static final int a=0;
  String m1(String s);//추상메소드가 하나만 있어야 람다식 사용가능
}
//구현체를 만든다
class MyFunctionImpl implements MyFunction{
	@Override
	public String m1(String s) {
		return "hello world!";
	}
}