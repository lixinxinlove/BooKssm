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


<form id="itemsForm" action="${pageContext.request.contextPath }/items/queryItems.action" method="post">

    商品列表：
    <table width="100%" border=1>
        <tr>
            <td>书号</td>
            <td>名称</td>
            <td>价格</td>
            <td>出版社</td>
            <td>编号</td>
        </tr>
        <c:forEach items="${itemsList }" var="item">
            <tr>
                <td><input type="checkbox" name="itemIds" value="${item.id }"></td>
                <td>${item.title}</td>
                <td>${item.marketPrice }</td>
                <td>${item.author }</td>
                <td>${item.isbn }</td>
            </tr>
        </c:forEach>

    </table>
</form>


<form action="http://localhost:8080/book/1000">

    用户名：<input type="text" name="fname" value=""/><br/>
    密码: <input type="text" name="lname" value=""/><br/>
    <input type="submit" value="Submit"/>

</form>


<div>
    ${list.size}
</div>

</body>
</html>
