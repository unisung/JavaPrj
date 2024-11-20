package ch01;
//재고정보 클래스
public class Stock {
	//속성=필드(field)=맴버변수=property
	String code;
	String name;
	int price;
	int qty;//현재 재고정보
	
	//생성자
	
	
	//메소드
	//입고
	void inStock(int amount) {
		qty=qty+amount;
	}
	
	//생성자 오버로딩
	//default생성자 
	public Stock() {}
	//매개변수4개짜리 생성자
	public Stock(String code, String name, int price, int qty) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	//출고
	void outStock(int amount) {
		qty=qty-amount;
	}
}
