<%--
  Created by IntelliJ IDEA.
  User: sheldon
  Date: 18-8-7
  Time: 上午10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="upload" method="post" enctype="multipart/form-data">
    选择图片:<input type="file" name="file" accept="image/*" /> <br>
    <input type="submit" value="上传">
</form>
</body>
</html>
