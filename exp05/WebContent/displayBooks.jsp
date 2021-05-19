<%@ page language="java" contentType="text/html; charset=utf-8" import="text1.*,java.sql.* " 
	pageEncoding="utf-8" import="java.util.List,java.util.ArrayList"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>diaplayBooks</title>
<style>
td
{
	text-align:center;
}
</style>
</head>
<body>
<table  border="1" align="center">
  <tr>
    <th scope="col">bookid</th>
    <th scope="col">title</th>
    <th scope="col">author</th>
    <th scope="col">pulbisher</th>
    <th scope="col">price</th>
  </tr>
  <%!int i=1;%>
  <%
  	try
    {  
  	ArrayList<BookBean> books=(ArrayList<BookBean>)session.getAttribute("books");
     for(BookBean book:books){
  %> 
    <tr>
      <td><%=book.getBookid()   %> </td>
      <td><%=book.getTitle()   %></td>
      <td><%=book.getAuthor()   %></td>
      <td><%=book.getPublisher()   %></td>
      <td><%=book.getPrice()   %></td>
    </tr>
 
 <% i++; }
}catch(Exception e)
 {%>  <tr><td>error</td><tr> <% } %>
</table>
</body>
</html>
