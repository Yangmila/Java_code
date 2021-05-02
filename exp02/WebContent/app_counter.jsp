<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
  <%
  synchronized (application) {
	  if(application.getAttribute("counter")==null)
      {
         application.setAttribute("counter", "1");
      }
      else 
      {
         String strnum=null;
         strnum =(String)application.getAttribute("counter");
         int count=0;
         count=Integer.valueOf(strnum).intValue();
         count++;
         application.setAttribute("counter",Integer.toString(count));
      } 
  }    
    %>
欢迎访问，您是第<%=application.getAttribute("counter") %>位访问者！
</body>
</html>