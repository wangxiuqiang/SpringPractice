<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-11-14
  Time: 下午6:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>跳转</title>
</head>
<body>

<form:form commandName="validationTest" method="post" action="${pageContext.request.contextPath}/validation">
   <form:input path="testName" value="${validationTest.testName}" id="testName" />
    <input type="submit" value="测试"/>
</form:form>
</body>
</html>
