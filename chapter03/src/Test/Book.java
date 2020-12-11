package Test;

public class Book {
	private String bookName;
	private int bookNum=0;
	private float price;
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
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public Book(String bookName,float price,String author,int bookNum)
	{
		setBookName(bookName);
		setPrice(price);
		setAuthor(author);
		setBookNum(bookNum);
	}
}
