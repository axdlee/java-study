<%--
  Created by IntelliJ IDEA.
  User: sheldon
  Date: 18-7-31
  Time: 上午9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = (String) session.getAttribute("name");
%>
session中的name: <%=name%>
</body>
</html>
