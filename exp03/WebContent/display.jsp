<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="exp03.UserBean">
	<jsp:setProperty name="user" property="*"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	UserName:<jsp:getProperty name="user" property="username"/><br>
 	Password:<jsp:getProperty name="user" property="password"/><br>
	Email:<jsp:getProperty name="user" property="email"/><br>
</body>
</html>
