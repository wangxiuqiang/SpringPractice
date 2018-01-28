<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 2018/1/25
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>title</title>
</head>
<body>
  url 跳过来了
<t:url value="/login" var="aIN"/>
  <a href="${aIN}">ttttt</a>

<t:escapeBody htmlEscape="true">
    <t:url value="/login" />
    <h1>dfsdfsd</h1>
</t:escapeBody>
</body>
</html>
