package Test;

public class Bookstore {
	private String bookstoreName;
	private String address;
	private String salesperson;
	

	public Bookstore(String bookstoreName,String address,String salesperson)
	{
		this.setBookstoreName(bookstoreName);
		this.setAddress(address);
		this.setSalesperson(salesperson);
	}

	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getSalesperson() {
		return salesperson;
	}

	//顾客买书
	public void importBook(Salesperson salesperson,Book book,int num) {
		book.setBookNum(num+book.getBookNum());
	}
	public void buyBook(Customer customer,Book book,int num)
	{
		if(num>book.getBookNum()) {
			System.out.println(book.getBookName()+"数目不够,"+Customer.getName()+"无法购买");
			System.out.println(book.getBookName()+"剩余数目为"+book.getBookNum());
		}
		else {
			if(num*book.getPrice()>customer.getMoney() ){
				System.out.println(Customer.getName()+"所带金额不足，无法购买");
			}
			else{
				System.out.println(Customer.getName()+"购买了"+num+"本"+book.getBookName()+",剩余金额为"+(customer.getMoney()-num*book.getPrice()) );
				book.setBookNum(book.getBookNum()-num);
			}		
		}
	}

	public void getRemainbook(Book book) {
		System.out.println(book.getBookName()+"剩余数目为"+book.getBookNum());
	}


	public void setBookstoreName(String bookstoreName) {
		this.bookstoreName = bookstoreName;
	}


	public String getBookstoreName() {
		return bookstoreName;
	}
}

