import java.sql.*;

public class ODBCTest {

	
	public static void main(String[] args)
	{
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    
		   
			Connection con=DriverManager.getConnection("jdbc:odbc:student","sa","sa123");
			//�������ݿ����Ӷ���
			//String strSql="update student set ssex='Ů' where sname='���÷'";
			//String strSql="delete from student where sname like '��%' ";
			String strSql="insert into student values('201809012','��Ӣ','Ů',20,'MA')";
			Statement st=con.createStatement();
			//����SQL���ִ�ж���
			st.execute(strSql);
			//ִ��SQL���
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
		//��������
		

	}

}
