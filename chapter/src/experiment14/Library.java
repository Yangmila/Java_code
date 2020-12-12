package experiment14;

public class Library {
	private String libraryName;
	private String address;
	
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

	public Library(String libraryName,String address){
		this.libraryName = libraryName;
		this.address = address;
	}
	
	//借书
	public void importBook(Book book,int num) {
		book.setBookNum(num+book.getBookNum());
	}
	public void buyBook(Student student,Book book,int num)
	{
		if(num>book.getBookNum()) {
			System.out.println(book.getBookName()+"数目不够,"+Student.getName()+"无法借阅");
			System.out.println(book.getBookName()+"剩余数目为"+book.getBookNum());
		}
		else {
				System.out.println(Student.getName()+"借了"+num+"本"+book.getBookName() );
				book.setBookNum(book.getBookNum()-num);
			}		
		}
	

	public void getRemainbook(Book book) {
		System.out.println(book.getBookName()+"剩余数目为"+book.getBookNum());
	}


}
