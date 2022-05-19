package arrayCopyEx;

public class Book {
	String bookName;
	String author;
	
	
	public Book() {
		this("제목 미상", "저자 미상");
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String _bookName) {
		this.bookName = _bookName;
	}
	
	public void setAuthor(String _author) {
		this.author = _author;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public void showBookInfo() {
		System.out.println(this + " 책의 제목 : " + this.getBookName());
		System.out.println(this + " 책의 저자 : " + this.getAuthor());
	}

}
