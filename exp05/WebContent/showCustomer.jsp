<%@page import="text3.CustomerBean"%>
<%@page import="text3.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8" import="text1.*,java.sql.* " 
	pageEncoding="utf-8" import="java.util.List,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int i=1;%>
 <%
  	try
    { 
  	CustomerDAO dao=new CustomerDAO();
  	ArrayList<CustomerBean> customers=dao.selectAllCustomer();
     for(CustomerBean customer:customers){
  %> 
  	第<%= i %>个用户</br>
  	姓名:<%= customer.getCustName() %></br>
  	email:<%= customer.getEmail() %></br>
  	phone:<%= customer.getPhone() %></br>
  	<% request.getSession().setAttribute("customer", customer); %>
  	<a href="updateCustomer.jsp">修改</a>
  	<a href="deleteCustomer.jsp">删除</a>
  	<% 
  	i++; }
}catch(Exception e)
 {   
	
 }
 %>
</body>
</html>