<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% pageContext.setAttribute("username",request.getParameter("username"),PageContext.REQUEST_SCOPE); %>
<%= pageContext.getAttribute("username",PageContext.REQUEST_SCOPE) %>
</body>
</html>