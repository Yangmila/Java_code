//学生表的数据访问类
import java.util.*;
import java.sql.*;
public class StudentDAO 
{
	private Connection con;
	
	public StudentDAO()
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    String conStr="jdbc:sqlserver://localhost:1433; DatabaseName=student_course";
		    //配置连接字符串
		    String user="sa";//超级管理员用户,拥有对于所有数据对象的所有操作权限
			String password="sa123";
			con=DriverManager.getConnection(conStr,user,password);
			//创建数据库连接对象
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public void addStu(StudentInfo stu)
	{
		try {
			//////以下用statement
			/*StringBuffer strSql=new StringBuffer();
			strSql.append("insert into student values('");
			strSql.append(stu.sno);
			strSql.append("','");
			strSql.append(stu.sname);
			strSql.append("','");
			strSql.append(stu.sex);
			strSql.append("',");
			strSql.append(stu.age);
			strSql.append(",'");
			strSql.append(stu.sdept);
			strSql.append("')");
			Statement st=con.createStatement();
			//创建SQL语句执行对象
			st.execute(strSql.toString());
			//执行SQL语句
			st.close();*/
			//////以下用PreparedStatment
			PreparedStatement ps;
			ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setString(1, stu.sno);
			ps.setString(2, stu.sname);
			ps.setString(3, stu.sex);
			ps.setInt(4, stu.age);
			ps.setString(5, stu.sdept);
			ps.execute();
			con.close(); 	
		} 	
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public void delStu(String sno)
	{
		try {
			StringBuffer strSql=new StringBuffer();
			strSql.append("delete from student where sno='");
			strSql.append(sno);
			strSql.append("'");
			Statement st=con.createStatement();
			//创建SQL语句执行对象
			st.execute(strSql.toString());
			//执行SQL语句
			st.close();
			con.close();
		    	
		} 
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public void updateStu(StudentInfo stu)
	{
		try {
			StringBuffer strSql=new StringBuffer();
			strSql.append("update student set sname='");
			strSql.append(stu.sname);
			strSql.append("', ssex='");
			strSql.append(stu.sex);
			strSql.append("', sage=");
			strSql.append(stu.age);
			strSql.append(", sdept='");
			strSql.append(stu.sdept);
			strSql.append("' where sno='");
			strSql.append(stu.sno);
			strSql.append("'");
			Statement st=con.createStatement();
			//创建SQL语句执行对象
			System.out.println(strSql.toString());
			st.execute(strSql.toString());
			//执行SQL语句
			st.close();
			con.close();
		    	
		} 
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public void addStudents(StudentInfo[] students)
	{
		if(students!=null)
		{
			if(students.length>0)
			{
				for(int i=0;i<students.length;i++)
				{
					addStu(students[i]);
				}
			}
		}
	}
	
	public void delStudents(String[] snos)
	{
		if(snos!=null)
		{
			if(snos.length>0)
			{
				for(int i=0;i<snos.length;i++)
				{
					delStu(snos[i]);
				}
			}
		}
	}
	
	public void updateStus(StudentInfo[] students)
	{
		if(students!=null)
		{
			if(students.length>0)
			{
				for(int i=0;i<students.length;i++)
				{
					updateStu(students[i]);
				}
			}
		}
	}
	
	public StudentInfo[] findAllStus()
	{
		ArrayList<StudentInfo> stus=new ArrayList<StudentInfo>();
		String strSql="select * from student";
		//创建SQL语句执行对象
		try
		{
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(strSql);
		//执行查询语句，把查询的结果保存到结果集对象中
		while(rs.next())//如果结果集中还有记录
		{
			String num=rs.getString(1);
			String name=rs.getString(2);
			String sex=rs.getString(3);
			int age=rs.getInt(4);
			String dept=rs.getString(5);
			StudentInfo stu=new StudentInfo(num,name,sex,age,dept);
			stus.add(stu);
		}
		rs.close();
		st.close();
		con.close();
		}
		catch(SQLException ex)
		{
			
		}
		return (StudentInfo[])stus.toArray(new StudentInfo[stus.size()]);
	}
	
	
	//根据学号来查询学生信息
	public StudentInfo findStuByNum(String sno)
	{
		String strSql="select * from student where sno='"+sno+"' ";
		StudentInfo result=null;
		try
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(strSql.toString());
			if(rs.next())
			{
				String num=rs.getString(1);
				String name=rs.getString(2);
				String sex=rs.getString(3);
				int age=rs.getInt(4);
				String dept=rs.getString(5);
				result=new StudentInfo(num,name,sex,age,dept);
			}
		}
		catch(SQLException ex)
		{
			
		}
		return result;
	}
	
	public StudentInfo[] findStusByName(String sname)
	{
		ArrayList<StudentInfo> stus=new ArrayList<StudentInfo>();
		String strSql="select * from student where sname like '%"+sname+"%' ";
		//创建SQL语句执行对象
		try
		{
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(strSql);
		//执行查询语句，把查询的结果保存到结果集对象中
		while(rs.next())//如果结果集中还有记录
		{
			String num=rs.getString(1);
			String name=rs.getString(2);
			String sex=rs.getString(3);
			int age=rs.getInt(4);
			String dept=rs.getString(5);
			StudentInfo stu=new StudentInfo(num,name,sex,age,dept);
			stus.add(stu);
		}
		rs.close();
		st.close();
		con.close();
		}
		catch(SQLException ex)
		{
			
		}
		return (StudentInfo[])stus.toArray(new StudentInfo[stus.size()]);
	}
	
	public StudentInfo[] findStusByDept(String sdept)
	{
		ArrayList<StudentInfo> stus=new ArrayList<StudentInfo>();
		String strSql="select * from student where sdept='"+sdept+"' ";
		//创建SQL语句执行对象
		try
		{
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(strSql);
		//执行查询语句，把查询的结果保存到结果集对象中
		while(rs.next())//如果结果集中还有记录
		{
			String num=rs.getString(1);
			String name=rs.getString(2);
			String sex=rs.getString(3);
			int age=rs.getInt(4);
			String dept=rs.getString(5);
			StudentInfo stu=new StudentInfo(num,name,sex,age,dept);
			stus.add(stu);
		}
		rs.close();
		st.close();
		con.close();
		}
		catch(SQLException ex)
		{
			
		}
		return (StudentInfo[])stus.toArray(new StudentInfo[stus.size()]);
	}
	
	public StudentInfo[] findStusByAge(int min,int max)
	{
		ArrayList<StudentInfo> stus=new ArrayList<StudentInfo>();
		String strSql="select * from student where sage between "+min+" and "+max+"  ";
		//创建SQL语句执行对象
		try
		{
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(strSql);
		//执行查询语句，把查询的结果保存到结果集对象中
		while(rs.next())//如果结果集中还有记录
		{
			String num=rs.getString(1);
			String name=rs.getString(2);
			String sex=rs.getString(3);
			int age=rs.getInt(4);
			String dept=rs.getString(5);
			StudentInfo stu=new StudentInfo(num,name,sex,age,dept);
			stus.add(stu);
		}
		rs.close();
		st.close();
		con.close();
		}
		catch(SQLException ex)
		{
			
		}
		return (StudentInfo[])stus.toArray(new StudentInfo[stus.size()]);
	}
}
