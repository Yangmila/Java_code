package Test;

public class Sample {
	
	    /**
		 * @param args
		 */
	    public static void main(String[] args) 
	    {
	    Clerk clerk=new Clerk("Tom","male",30);
	    Books book1=new Books("A Dream in Red Monsion",40.5,199.9,"20201001",20);
	    Books book2=new Books("The Monkey King",30.5,88.9,"20201002",30);
	    Books book3=new Books("Romance of the Three Kingdoms",37.7,99.9,"20201003",20);
	    Books book4=new Books("Water Margin",30.0,80.8,"20201004",40);

	    Customer cust=new Customer("Mary","female",20,200.0);

	    Bookstore bookstore=new Bookstore("XinHua","Baker Street 221B","Sherlock",1000,50);
	    bookstore.setClerk(clerk);
	    bookstore.setCurrentCount(500);
	    bookstore.setCurrentPerson(200);

	    bookstore.inOneBook(book1);
	    bookstore.inOneBook(book2);
	    bookstore.inOneBook(book3);
	    bookstore.inOneBook(book4);
	    System.out.println("currentcount"+bookstore.getCurrentCount());

	    bookstore.inOneCust(cust);
	    System.out.println("currentperson"+bookstore.getCurrentPerson());

	    bookstore.saleBook(book1,cust);
	    System.out.println("currentcount"+bookstore.getCurrentCount());
	    }
	}

