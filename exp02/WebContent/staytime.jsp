<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
java.util.Date now=new java.util.Date();
response.setHeader("refresh", "10");

%>
登录时间为:<%=now %>

<form name="form1" method="post" action="">
    <center>
        <p><font size="5" color="#0000FF">您在本站已停留：</font></p>
        <p>
            <input name="textarea" type="text" value="">
        </p>
    </center>
    <script language="javascript">
        var second=0;
        var minute=0;
        var hour=0;
        window.setTimeout("interval();",1000);
        function interval()
        {
            second++;
            if(second==60)
            {
                second=0;minute+=1;
            }
            if(minute==60)
            {
                minute=0;hour+=1;
            }
            document.form1.textarea.value = hour+"时"+minute+"分"+second+"秒";
            window.setTimeout("interval();",1000);
            
        }
        
    </script>
</form>

</body>
</html>