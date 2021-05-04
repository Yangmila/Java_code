<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
${sessionScope.message }<br>
<form action="CheckUserServlet" method="post">
用户名:<input type="text" name="username" size="20"><br><br>
密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="password" size="21"><br><br>
<input type="checkbox" name="check" value="check">自动登录<br><br>
<input type="submit" value="登录">
<input type="reset" value="取消">
</form>
</body>
</html>