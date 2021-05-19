package first;

import java.sql.*;
import java.sql.SQLException;

public class BookDAO {
	private static  Connection con;
	/*public static void main(String args[]) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test";
		 con=DriverManager.getConnection(url,"root","123456");
		bookid(1);
	}*/
	
	public BookDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test";
			con=DriverManager.getConnection(url,"root","aini95427");
		}
		catch(Exception e) {
			
		}
	}
  public ResultSet result() throws ClassNotFoundException, SQLException {
		/*Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test";
		con=DriverManager.getConnection(url,"root","123456");*/
   	    Statement stmt=con.createStatement();
   	    String sql="select * from books";
   	    ResultSet rs=stmt.executeQuery(sql);
		return rs;
	}
  
	public static  String bookid(int i)throws SQLException {
		
		Statement stmt=con.createStatement();
	    String sql="select * from books";
	    ResultSet rs=stmt.executeQuery(sql);
	    BookBean book=new BookBean();
		String result="";
		try {
		    int rowCount=0;
		    while(rs.next()) {
		    	rowCount++;
		    	    if(rowCount==i)
		    	    {
		    	    	book.setBookid(rs.getString(1));
			    		result=book.getBookid();
			    		System.out.print(result);
			    		break;
		    	    }
		    	
			   }
		    //conn.close();
		}catch(Exception e) {
			
		}
		return result;
	
	}
}


