<%--
  Created by IntelliJ IDEA.
  User: sheldon
  Date: 18-7-31
  Time: 上午9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("name", "value");
%>
<a href="getSession.jsp">跳转到获取session页面</a>
</body>
</html>
