<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>收集用户登录信息</title>
</head>
<body>
<form action="deal.jsp" name="form" method="post">
	用户名：<input name="username" type="text" id="name" style="widtn:120px"><br/>
	<br/>
	密&nbsp;&nbsp;&nbsp;&nbsp;码：<input name="pwd" type="password" id="pwd" style="width:150px"><br/>
 	<br/>
 	<input type="submit" name="Submit" value="登录"/>
</form>
</body>
</html>