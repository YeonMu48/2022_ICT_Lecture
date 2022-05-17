package bookArrayEx;

public class Book {
	String bookName;
	String author;
	
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
	
}
