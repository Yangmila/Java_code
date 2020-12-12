package experiment14;

public class Book {
	private String bookName;
	private int bookNum=0;
	private String author;
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public Book(String bookName,String author,int bookNum)
	{
		setBookName(bookName);
		setAuthor(author);
		setBookNum(bookNum);
	}
}
