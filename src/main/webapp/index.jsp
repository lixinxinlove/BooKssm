<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>登录</h2>

<form action="/user/login" method="post">

    <input type="text" value="" name="userName"><br/>
    <input type="text" value="" name="userPassword"><br/>
    <input type="submit" value="登录">

</form>

</body>
</html>
