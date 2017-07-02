<%--
  Created by IntelliJ IDEA.
  User: lixinxin
  Date: 2017/6/24
  Time: 19:55
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>detail</title>
</head>
<body>

<div>

    书编号： <input type="text" value=${book.bookId}> <br/>
    书名： <input type="text" value=${book.name}> <br/>
    库存： <input type="text" value=${book.number}> <br/>

</div>

</body>
</html>
