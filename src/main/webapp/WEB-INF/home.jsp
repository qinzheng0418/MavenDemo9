
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="75%" height="75%">
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="v">

        <tr>
            <td>${v.count}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
