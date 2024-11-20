package ch03;

public class StockArrayMain {
	public static void main(String[] args) {
	 Stock[] stockArray = new Stock[10];//[][][][]
	 stockArray[0] = new Stock("88001","새우깡",1500,100);
	 stockArray[1] = new Stock("88002","고구마깡",2000,300);
	 
	 //객체 참조변수가 println()문의 매개변수로 전달되면
	 //toString()메소드가 자동호출
	 System.out.println(stockArray[0]);
	 
	 //반복문을 이용한 전체 출력
	 for(int i=0;i<stockArray.length;i++) {
		 if(stockArray[i]!=null) {
			 System.out.println(stockArray[i]);
		 }
	 }
	}
}
