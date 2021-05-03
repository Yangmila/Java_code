<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="cal" class="exp03.SimpleCalcuator">
<jsp:setProperty name="cal" property="*"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calculate.jsp" method="post">
<input type="text" name="first">
<select name="operator">
	<option value="+">+</option>
	<option value="-">-</option>
	<option value="*">*</option>
	<option value="/">/</option>
</select>
<input type="text" name="second">=
<%
 try{
	 float first = cal.getFirst();
	 float second = cal.getSecond();
	 String op = cal.getOperator();
	 float result = cal.calculate(first,second,op);
	 out.print(result);
 }catch (Exception e){
	 e.printStackTrace();
 }

%>
<br>
<input type="submit" value="提交">
</form>
</body>
</html>