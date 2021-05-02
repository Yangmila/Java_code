<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="errorHandler.jsp" %>
<html>
<head>
    <title>获取名字</title>
</head>
<body>
    <%
        String name=request.getParameter("name");
   	 	java.net.URLDecoder.decode(name,"utf-8");
        if(name==null) {
            throw new RuntimeException("没有指定name参数");
        }
    %>
    Hello,<%=name%>
</body>
</html>
