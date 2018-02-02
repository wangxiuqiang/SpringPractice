<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 18-2-1
  Time: 下午7:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<%--显示登录的这个用户的姓名  authentication用来渲染用户认证对象的详细信息--%>
<sec:authentication property="principal.username" />
<br>
<br>
<sec:authorize access="hasRole('USER')">
    我是有USER权限的人
</sec:authorize>
<sec:authorize access="hasRole('ADMIN')">
    我是有管理权限的人
</sec:authorize>
success
<sec:authorize url="/failure">
    <a href="/failure">failure</a>
</sec:authorize>
<a href="/logout">Logout</a>
<br>
<a href="/signout">Logout</a>
</body>
</html>
