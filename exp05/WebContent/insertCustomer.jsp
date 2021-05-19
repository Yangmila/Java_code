<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
请插入客户信息！</br>
<form action="InsertCustomerServlet" method="post">
姓名：<input type="text" name="custName"></br>
邮箱：<input type="text" name="email"></br>
电话：<input type="text" name="phone"></br>
<input type="submit" value="插入">
<input type="reset" value="重填">
</form>
${sessionScope.message }<br>
</body>
</html>