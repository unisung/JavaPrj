package ch05;

public class Book {
	private String title;
	private String author;
	private int pageCount;
	
	public Book() {	
		this.title="춘향전";
		this.author="모름";
		this.pageCount = 500;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public Book(String title, String author, int pageCount) {
		this(title, author);//this()같은 클래스내에서 다른 생성자호출
		this.pageCount = pageCount;
	}
	
	
	

}
