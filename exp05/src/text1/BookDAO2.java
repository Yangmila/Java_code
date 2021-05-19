package text1;
import java.sql.*;
import java.util.ArrayList;

public class BookDAO2 {
	private static  java.sql.Connection con;
	public static void main(String args[]) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/new_schema";
		con=DriverManager.getConnection(url,"root","aini95427");
		Statement st=con.createStatement();
		String sql="select * from books";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		con.close();
	}
	public BookDAO2() throws ClassNotFoundException, SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/new_schema";
		con=DriverManager.getConnection(url,"root","aini95427");
		}
		catch(ClassNotFoundException e1) {
			System.out.println(e1);
		}
		catch(SQLException e2) {
			System.out.println(e2);
		}
	}	
	public static ArrayList<BookBean> result() throws SQLException, ClassNotFoundException {
		ArrayList<BookBean> books=new ArrayList<BookBean>();
		Statement st=con.createStatement();
		String sql="select * from books";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			BookBean x=new BookBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5));
			books.add(x);
		}
		return books;
	}
	public  BookBean searchBook(String bookid) throws SQLException, ClassNotFoundException 
	{
		BookBean bookbean=new BookBean();
		Statement st=con.createStatement();
		String sql="select * from book where bookid="+bookid;
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()) 
		{
				bookbean.setBookid(rs.getString(1));
				bookbean.setTitle(rs.getString(2));
				bookbean.setAuthor(rs.getString(3));
				bookbean.setPublisher(rs.getString(4));
				bookbean.setPrice(rs.getFloat(5));
		}else 
		{
			return null;
		}
		return bookbean;
	
	}
	public boolean insertBook(BookBean book) throws SQLException
	{
		Statement st=con.createStatement();
		String sql="insert into book values('"+book.getBookid()+"','"+book.getTitle()+"','"+book.getAuthor()+"','"+book.getPublisher()+"',"+book.getPrice()+")";
	    boolean rs=st.execute(sql);
		if(!rs) 
		{
			return true;
		}
		return false;
	}
	
}



