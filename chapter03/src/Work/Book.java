package Work;

public class Book {
	private String isbn;
	private String press;
	private String author;
	private float price;
	private int   pageNum;
	
	public void setIsbn(String isbn)throws BookException {
		if(isbn.length()!=13){
			throw new BookException("ISBN���Ȳ���13λ��");
		}
		else{
			if(!isbnIsAllDigit(isbn)){
				throw new BookException("ISBN���з������ַ�");
			}
			else
			{
				this.isbn = isbn;
			}
				
		}
		
	}
	
	private boolean isbnIsAllDigit(String isbn){
		boolean result=true;
		for(int i=0;i<isbn.length();i++){
			char ch=isbn.charAt(i);
			if((ch<'0')||(ch>'9'))
			{
				result=false;
				break;
			}
		}
		return result;
		}
	
	public String getIsbn() {
		return isbn;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getPress() {
		return press;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(float price)throws BookException {
		if(price<=0)
		{
			throw new BookException("�۸�������0Ԫ��");
		}
		else{
			this.price = price;
		}
	}
	public float getPrice() {
		return price;
	}
	
	public void setPageNum(int pageNum)throws BookException {
		if(pageNum<0)
		{
			throw new BookException("ҳ��������0��");
		}
		else{
		this.pageNum = pageNum;
		}
	}
	public int getPageNum() {
		return pageNum;
	}

	public Book(String isbn,String press,String author,float price,int pageNum)throws BookException{
		setIsbn(isbn);
		setPress(press);
		setAuthor(author);
		setPrice(price);
		setPageNum(pageNum);
	}
}
