package ch04;

import java.text.DecimalFormat;

//재고정보 클래스 - 캡슐화
public class Stock extends Object{
	static int seq;
	//초기화블럭
	{
		seq++;//무조건 객체생성시 1씩 증가
		code = "88"+String.format("%03d",seq); //code는 객체생성시 null로 초기화
	}
	//속성=필드(field)=맴버변수=property
	private String code;
	private String name;
	private int price;
	private int qty;//현재 재고정보 - 해당타입의 기본값으로 자동 초기화
	
	
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
	public Stock() {
	}
	//매개변수4개짜리 생성자
	public Stock(String code, String name, int price, int qty) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	
	public Stock(String name, int price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	//메소드
	//입고
	public void inStock(int amount) {
		int amt=0; //지역변수=로컬변수
		//amt=amount;
		amt = qty;
		qty=qty+amt;
	}
	
	//출고 - 현재고 - 출고량 >=0, if(현재고 - 출고량 <0) 오류발생
	public void outStock(int amount) throws Exception{
		if(qty - amount < 0) {
			throw new Exception("재고가 모자랍니다");
		}
		qty=qty-amount;
	}
	@Override
	public String toString() {
		return "Stock [code=" + code + ", name=" + name + ", qty=" + qty + "]";
	}
}
