package ch02;

public class StockMain {
	public static void main(String[] args) {
	 
	Stock stock1 = new Stock();
	stock1.setCode("88001");
	stock1.setName("새우깡");
	stock1.setPrice(1500);
	stock1.setQty(100);
	
	Stock stock2 = 
	 new Stock(new String("88002"), "고구마깡", 2000, 300);

	//출고처리(새우깡 5개를 출고처리)
	stock1.outStock(5);
	System.out.println(stock1.getQty());
	//입고처리(고구마깡 25개 입고)
	stock2.inStock(25);
	System.out.println(stock2.getQty());
	
	//출고처리
	//stock1.qty = 7;
	System.out.println(stock1.getQty());
	
	//출고
	stock1.outStock(120);
	System.out.println(stock1.getQty());
	

	}
}
