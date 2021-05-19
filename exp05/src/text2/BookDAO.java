package text2;
import java.sql.*;

public class BookDAO {
	public static  Connection con;
	public BookDAO() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/new_schema";
			con=DriverManager.getConnection(url,"root","aini95427");
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
}

