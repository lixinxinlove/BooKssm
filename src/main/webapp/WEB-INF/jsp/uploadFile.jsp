<%--
  Created by IntelliJ IDEA.
  User: android
  Date: 2017/7/12
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/file/upload" method="post" enctype="multipart/form-data">

    <input type="file" value="选择文件" name="file"><<br/><<br/>
    <input type="text" value="" name="fileName"><<br/><<br/>
    <input type="submit" value="上传">

</form>

</body>
</html>
