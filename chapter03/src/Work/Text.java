package Work;

public class Text {
	public static void main(String[] args) {
		try{
			Book book=new Book("2011060601011","�廪��ѧ������","����",66,-7);
		}
		catch(BookException ex){
			System.out.println(ex.getMessage());
			
		}

	}

}