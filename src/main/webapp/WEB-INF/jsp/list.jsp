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

<script>
    function prevPage() {
        window.location = "/book/prev/" + (parseInt(document.getElementById("page").value) - 1);
    }

    function nextPage() {
        window.location = "/book/next/" + (parseInt(document.getElementById("page").value) + 1);
    }

    function success(text) {
        var textarea = document.getElementById('response-text');
       // var obj = eval(text);
      //  var obj = text.parseJSON();

      //  alert(obj.title);
      //  alert(obj.id);

        textarea.value = text;

    }

    function fail(code) {
        var textarea = document.getElementById('response-text');
        textarea.value = 'Error code: ' + code;
    }

    var request = new XMLHttpRequest(); // 新建XMLHttpRequest对象

    request.onreadystatechange = function () { // 状态发生变化时，函数被回调
        if (request.readyState === 4) { // 成功完成
            // 判断响应结果:
            if (request.status === 200) {
                // 成功，通过responseText拿到响应的文本:
                return success(request.responseText);
            } else {
                // 失败，根据响应码判断失败原因:
                return fail(request.status);
            }
        } else {
            // HTTP请求还在继续...

           // return fail(request.readyState);
        }
    }

    function rewuestAnsy() {
        // 发送请求:
        request.open('GET', '/book/json/1000');
        request.send();
    }

    //    alert('请求已发送，请等待响应...');

</script>

<body>

<h1>${sessionScope.userName }登录成功!!!</h1>
<h2>欢迎您,${sessionScope.userPassword }</h2>

<form>
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

<br/>

<button onclick="prevPage()">上一页</button>

<input type="text" value="${page}" id="page" name="page">

<button onclick="nextPage()">下一页</button>

<button onclick="rewuestAnsy()">异步请求</button>

<input type="text" id="response-text">

</body>
</html>
