package Test;

public class Bookstore {

	    private String bsName;
	    private String bsAddress;/*书店地址*/
	    private String bossName;/*书店老板名字*/
	    private Books[] bookList;/*书店拥有的书*/
	    private int maxCount;
	    private int currentCount;/*当前书的数目*/
	    private int person;
	    private int currentPerson;
	    private Customer[] custList;/*客人*/
	    private Clerk clerk;/*店员*/

	    public Bookstore(String bsName,String bsAddress,String bossName,int maxCount,int person)
	    {
	        this.setBsName(bsName);
	        this.setBsAddress(bsAddress);
	        this.setBossName(bossName);
	        this.setMaxCount(maxCount);
	        this.setPerson(person);
	        bookList=new Books[maxCount];
	        custList=new Customer[person];

	    }

	    
	    public String getBsName()
	    {
	        return bsName;
	    }
	    public void setBsName(String bsName)
	    {
	        this.bsName=bsName;
	    }

	    //书店地址
	    public String getBsAddress()
	    {
	        return bsAddress;
	    }
	    public void setBsAddress(String bsAddress)
	    {
	        this.bsAddress=bsAddress;
	    }

	    //老板名字
	    public String getBossName()
	    {
	        return bossName;
	    }
	    public void setBossName(String bossName)
	    {
	        this.bossName=bossName;
	    }

	    //书店拥有的书
	    public void setBooks(Books[] bookList) 
	    {
			this.bookList = bookList;
		}
	    public Books[] getBookList() 
	    {
			return bookList;
	    }
	    
	    
	    public int getMaxCount()
	    {
			return maxCount;
	    }
	    public void setMaxCount(int maxCount) 
	    {
			this.maxCount = maxCount;
		}
	    
	    
	    //当前书的数目
	    public int getCurrentCount() 
	    {
	        return currentCount;
	    }
	    public void setCurrentCount(int currentCount)
	    {
	        this.currentCount = currentCount;
	    }

	    
	    public int getPerson()
	    {
			return person;
	    }
	    public void setPerson(int person) 
	    {
			this.person = person;
		}
	    
	    //当前的客人数
	    public int getCurrentPerson()
	    {
			return currentPerson;
	    }
	    public void setCurrentPerson(int currentPerson) 
	    {
			this.currentPerson = currentPerson;
	    }
	    
	    //客人
	    public Customer[] getCustList() 
	    {
			return custList;
	    }
	    public void setCustomer(Customer[] custList) 
	    {
			this.custList = custList;
		}

	    //店员
	    public Clerk getClerk()
	    {
	        return clerk;
	    }
	    public void setClerk(Clerk clerk)
	    {
	        this.clerk=clerk;
	    }

	    
		public void inCustomers(Customer[] inCustList)
		{
			for(int i=0;i<inCustList.length;i++)
			{
				inOneCust(inCustList[i]);
			}
		}
		
		public void inOneCust(Customer cust)
		{
			if(currentPerson==person)
			{
				System.out.println("Please wait a moment!");
			}
			else
			{
				currentPerson++;
				for(int i=0;i<custList.length;i++)
				{
					if(custList[i]==null)
					{
						custList[i]=cust;
						System.out.println(cust.getCustName()+" already get into the bookstore.");
						break;
					}
				}
			}
		}
		
		public void outOneCust(Customer cust)
		{
			for(int i=0;i<custList.length;i++)
			{
				if(custList[i]!=null)
				{
				if(custList[i].equals(cust))
				{
					custList[i]=null;
					System.out.println(cust.getCustName()+" already get out.");
					currentPerson--;
					break;
				}
				}
			}
		}
		
		public void outCustomers(Customer[] outCustList)
		{
			for(int i=0;i<outCustList.length;i++)
			{
				outOneCust(outCustList[i]);
			}
	    }
	    
	    //进书
	    public void inBooks(Books[] inBookList)
		{
			for(int i=0;i<inBookList.length;i++)
			{
				inOneBook(inBookList[i]);
			}
		}
		
		public void inOneBook(Books book)
		{
			if(currentCount==maxCount)
			{
				System.out.println("Too much books!");
			}
			else
			{
				currentCount+=book.getBookCount();
				for(int i=0;i<bookList.length;i++)
				{
					if(bookList[i]==null)
					{
						bookList[i]=book;
						System.out.println(book.getBookName()+" already stay at the bookstore.");
						break;
					}
				}
			}
	    }
	    
	    //售书
	    public void saleBook(Books book,Customer cust)
	    {
	        if(book.getSalePrice()>cust.getMoney())
	        {
	            System.out.println(cust.getCustName()+" don't have enough money!");
	        }
	        else
	        {
	            cust.setMoney(cust.getMoney()-book.getSalePrice());
	            currentCount--;
	            System.out.println(cust.getCustName()+" already get "+book.getBookName());
	            System.out.println(cust.getCustName()+" have left "+cust.getMoney());
	        }
	    }
	}

