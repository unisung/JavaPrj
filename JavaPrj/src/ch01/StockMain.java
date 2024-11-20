package ch01;

public class StockMain {
	public static void main(String[] args) {
	 
	Stock stock1 = new Stock();
	stock1.code="88001";
	stock1.name="새우깡";
	stock1.price=1500;
	stock1.qty=100;
	
	Stock stock2 = 
	 new Stock(new String("88002"), "고구마깡", 2000, 300);

	//출고처리(새우깡 5개를 출고처리)
	stock1.outStock(5);
	System.out.println(stock1.qty);
	//입고처리(고구마깡 25개 입고)
	stock2.inStock(25);
	System.out.println(stock2.qty);
	
	//출고처리
	stock1.qty = 7;
	System.out.println(stock1.qty);
	

	}
}
