<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String username=(String)session.getAttribute("username"); %>
<%=username %>您好,欢迎访问！<br/>
<br/>
<a href="exit.jsp">[退出]</a>
</body>
</html>