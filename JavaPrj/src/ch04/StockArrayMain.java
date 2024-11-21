package ch04;

public class StockArrayMain {
	public static void main(String[] args) {
	 Stock[] stockArray = //new Stock[10];//[][][][]
	// stockArray[0] = new Stock("88001","새우깡",1500,100);
	// stockArray[1] = new Stock("88002","고구마깡",2000,300);
		 {
				 new Stock("새우깡",1500,100),	
				 new Stock("고구마깡",2000,100),
				 new Stock("카스1",2500,300),
		 };
	 //반복문을 이용한 전체 출력
	 for(int i=0;i<stockArray.length;i++) {
		 if(stockArray[i]!=null) {
			 System.out.println(stockArray[i]);
		 }
	 }
	 //향상된 for문
	 for(Stock stock :stockArray) {
		System.out.println(stock);
	 }
	 
	 
	}
}
