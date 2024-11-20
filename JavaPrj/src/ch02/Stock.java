package ch02;
//재고정보 클래스 - 캡슐화
public class Stock {
	//속성=필드(field)=맴버변수=property
	private String code;
	private String name;
	private int price;
	private int qty;//현재 재고정보
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	//생성자
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
	//메소드
	//입고
	public void inStock(int amount) {
		qty=qty+amount;
	}
	
	//출고
	public void outStock(int amount) {
		qty=qty-amount;
	}
}
