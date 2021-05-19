<%@page import="text3.CustomerBean"%>
<%@page import="text3.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ActionServlet" method="post">
<% request.setCharacterEncoding("utf-8"); %>
<% CustomerBean customer=(CustomerBean)request.getSession().getAttribute("customer"); %>
姓名:<input type="text" name="custName" value=<%=customer.getCustName() %> readonly><br>
email:<input type="text" name="email" value=<%=customer.getEmail() %> readonly><br>
phone:<input type="text" name="phone" value=<%=customer.getPhone() %> readonly><br>
<input type="submit" value="删除">
</form>
${sessionScope.message1 }<br>
</body>
</html>