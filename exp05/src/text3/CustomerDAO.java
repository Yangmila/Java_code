package text3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;



public class CustomerDAO {
	public static  Connection con;
	public CustomerDAO() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/new_schema";
			con=DriverManager.getConnection(url,"root","999305@lxy");
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	public boolean insertCustomer(CustomerBean customer) throws SQLException 
	{
		String sql="insert into customer values(?,?,?)";	
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, customer.getCustName());
		st.setString(2, customer.getEmail());
		st.setString(3, customer.getPhone());
		boolean rs=st.execute();
		if(!rs) 
		{
			return true;
		}
		return false;
	}
	public ArrayList<CustomerBean> selectAllCustomer() throws SQLException 
	{
		String sql="select * from customer";	
		ArrayList<CustomerBean> customers=new ArrayList<CustomerBean>();
		PreparedStatement st=con.prepareStatement(sql);
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			CustomerBean customer=new CustomerBean();
			customer.setCustName(rs.getString("custName"));
			customer.setEmail(rs.getString("email"));
			customer.setPhone(rs.getString("phone"));
			customers.add(customer);
		}
		return customers;
	}
	public boolean updateCustomer(CustomerBean customer) throws SQLException{
		
		String sql="update customer set email=?,phone=? where custName=?";	
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, customer.getEmail());
		st.setString(2, customer.getPhone());
		st.setString(3, customer.getCustName());
		
		int suc=st.executeUpdate();
		if(suc==0) return false;
		else return true;
	}
	public boolean deleteCustomer(CustomerBean customer) throws SQLException{
		String sql="delete from customer where custName=?";	
		PreparedStatement st=con.prepareStatement(sql);
		//System.out.println(customer.getCustName());
		st.setString(1, customer.getCustName());
		int suc=st.executeUpdate();
		if(suc==0) return false;
		else return true;
	}
}

