<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: sheldon
  Date: 18-7-30
  Time: 下午5:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=new Date().toLocaleString()%>
<%
    Cookie c = new Cookie("name", "value");
    c.setMaxAge(3600);
    c.setPath("/");
    response.addCookie(c);
%>
</body>
</html>
