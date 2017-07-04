<%--
  Created by IntelliJ IDEA.
  User: lixinxin
  Date: 2017/6/24
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${sessionScope.userName }登录成功!!!</h1>
<h2>欢迎您,${sessionScope.userPassword }</h2>

<form  >
    书单：
    <table width="100%" border=1>
        <tr>
            <td>书号</td>
            <td>名称</td>
            <td>价格</td>
            <td>作者</td>
            <td>编号</td>
        </tr>
        <c:forEach items="${itemsList}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.title}</td>
                <td>${item.marketPrice }</td>
                <td>${item.author }</td>
                <td>${item.isbn }</td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
