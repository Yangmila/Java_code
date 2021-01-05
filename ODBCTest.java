import java.sql.*;

public class ODBCTest {

	
	public static void main(String[] args)
	{
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    
		   
			Connection con=DriverManager.getConnection("jdbc:odbc:student","sa","sa123");
			//创建数据库连接对象
			//String strSql="update student set ssex='女' where sname='李红梅'";
			//String strSql="delete from student where sname like '黑%' ";
			String strSql="insert into student values('201809012','王英','女',20,'MA')";
			Statement st=con.createStatement();
			//创建SQL语句执行对象
			st.execute(strSql);
			//执行SQL语句
			st.close();
			con.close();
		    	
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
		//加载驱动
		

	}

}
