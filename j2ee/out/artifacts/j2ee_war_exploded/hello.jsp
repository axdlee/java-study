<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
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
    List<String> words = new ArrayList<>();
    words.add("today");
    words.add("is");
    words.add("a");
    words.add("great");
    words.add("day");
%>
<table width="200px" align="center" border="1" cellspacing="0">
    <%for(String word: words) { %>
    <tr>
        <td><%=word%></td>
    </tr>
    <%}%>
</table>
<jsp:include page="footer.jsp">
    <jsp:param name="year" value="2018"></jsp:param>
</jsp:include>
</body>
</html>
