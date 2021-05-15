<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Table</title>
</head>
<body>
<%
String str="";
for(int i=1;i<=9;i++){
for(int j=1;j<=i;j++){
str+=j+"*"+i+"="+j*i+"&nbsp;&nbsp;";
}
str+="<br>";
}
%>
<div>
<%=str%>
</div>
</body>
</html>