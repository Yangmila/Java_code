package Work;

public class Text {
	public static void main(String[] args) {
		try{
			Book book=new Book("2011060601011","清华大学出版社","张三",66,-7);
		}
		catch(BookException ex){
			System.out.println(ex.getMessage());
			
		}

	}

}