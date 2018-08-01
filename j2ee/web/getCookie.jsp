<%--
  Created by IntelliJ IDEA.
  User: sheldon
  Date: 18-7-31
  Time: 上午9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    if (null != cookies) {
        for (int i = 0; i < cookies.length; i++) {
            out.println(cookies[i].getName() + ":" + cookies[i].getValue());
        }
    }
%>
</body>
</html>
