<%@page import="text3.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ActionServlet" method="get">
<% request.setCharacterEncoding("utf-8"); %>
<% CustomerBean customer=(CustomerBean)request.getSession().getAttribute("customer"); %>
姓名:<input type="text" name="custName" value=<%=customer.getCustName() %> readonly><br>
email:<input type="text" name="email" value=<%=customer.getEmail() %>><br>
phone:<input type="text" name="phone" value=<%=customer.getPhone() %>><br>
<input type="submit" value="修改">
</form>
${sessionScope.message }<br>
</body>
</html>