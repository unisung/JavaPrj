package ch09;

//static메소드를 static import하여 메소드만 호출할수 있음.
import static java.lang.Math.sqrt;
import static java.lang.Math.random;

public class ImportStaticExample {
	public static void main(String[] args) {
	//double result = Math.sqrt(16.0);
    double result = sqrt(16.0);
	System.out.println("Square root of 16 is:"+result);

	System.out.println(random());
	}
}
