<%--
  Created by IntelliJ IDEA.
  User: lixinxin
  Date: 2017/6/24
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form>

    用户名：<input type="text" name="fname" value="Mickey"/><br/>
    密码:<input type="text" name="lname" value="Mouse"/><br/>
    <input type="submit" value="Submit"/>

</form>


<div>
    ${list.get(0).getName}
</div>

</body>
</html>
