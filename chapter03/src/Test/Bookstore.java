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

	//�˿�����
	public void importBook(Salesperson salesperson,Book book,int num) {
		book.setBookNum(num+book.getBookNum());
	}
	public void buyBook(Customer customer,Book book,int num)
	{
		if(num>book.getBookNum()) {
			System.out.println(book.getBookName()+"��Ŀ����,"+Customer.getName()+"�޷�����");
			System.out.println(book.getBookName()+"ʣ����ĿΪ"+book.getBookNum());
		}
		else {
			if(num*book.getPrice()>customer.getMoney() ){
				System.out.println(Customer.getName()+"�������㣬�޷�����");
			}
			else{
				System.out.println(Customer.getName()+"������"+num+"��"+book.getBookName()+",ʣ����Ϊ"+(customer.getMoney()-num*book.getPrice()) );
				book.setBookNum(book.getBookNum()-num);
			}		
		}
	}

	public void getRemainbook(Book book) {
		System.out.println(book.getBookName()+"ʣ����ĿΪ"+book.getBookNum());
	}


	public void setBookstoreName(String bookstoreName) {
		this.bookstoreName = bookstoreName;
	}


	public String getBookstoreName() {
		return bookstoreName;
	}
}

