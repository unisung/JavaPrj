package ch04;

public class StockArrayMain2 {
	public static void main(String[] args) {
	 Stock[] stockArray = {
	 new Stock("88001","새우깡",1500,100),
	 new Stock("88002","고구마깡",2000,300)
	  }	;
	 
	 System.out.println(stockArray.length);
	
	 //객체 참조변수가 println()문의 매개변수로 전달되면
	 //toString()메소드가 자동호출
	 System.out.println(stockArray[0]);
	 
	 //반복문을 이용한 전체 출력
	 for(int i=0;i<stockArray.length;i++) {
			 System.out.println(stockArray[i]);
	 }
	 
	}
}
