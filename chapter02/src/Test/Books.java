package Test;

public class Books {

	    private String bookName;//书名
	    private double inPrice;//进价
	    private double salePrice;//售价
	    private String bookID;//书的对应编号
	    private int bookCount;

	    
	    public String getBookName()
	    {
	        return bookName;
	    }
	    public void setBookName(String bookName)
	    {
	        this.bookName=bookName;
	    }
	    
	    
	    public double getInPrice()
	    {
	        return inPrice;
	    }
	    public void setInPrice(double inPrice)
	    {
	        this.inPrice=inPrice;
	    }
	    
	    
	    public double getSalePrice()
	    {
	        return salePrice;
	    }
	    public void setSalePrice(double salePrice)
	    {
	        this.salePrice=salePrice;
	    }
	    
	    
	    public String getBookID()
	    {
	        return bookID;
	    }
	    public void setBookID(String bookID)
	    {
	        this.bookID=bookID;
	    }

	    
	    public int getBookCount()
	    {
	        return bookCount;
	    }
	    public void setBookCount(int bookCount)
	    {
	        this.bookCount=bookCount;
	    }
	    
	    public Books(String bookName,double inPrice,double salePrice,String bookID,int bookCount)
	    {
	        setBookName(bookName);
	        setInPrice(inPrice);
	        setSalePrice(salePrice);
	        setBookID(bookID);
	        setBookCount(bookCount);
	    }
	}

