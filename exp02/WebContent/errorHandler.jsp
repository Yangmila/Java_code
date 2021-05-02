<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>错误处理</title>
</head>
<body>
<%
response.setStatus(200);
%>
请求不能处理:<%=exception.getMessage() %><br/>
请重试！
</body>
</html>