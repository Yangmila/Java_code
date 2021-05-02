<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    String[][] userList={{"白敬亭","123456"},{"杨杰","78976"}};
    boolean flag=false;
    request.setCharacterEncoding("utf-8");
    String username = request.getParameter("username");
    String pwd=request.getParameter("pwd");
    for(int i=0;i<userList.length;i++){
        if(userList[i][0].equals(username)){
            if(userList[i][1].equals(pwd)){
                flag=true;
                break;
            }
        }
    }
    if(flag){
        session.setAttribute("username", username);
        response.sendRedirect("main.jsp");
    }else{
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>