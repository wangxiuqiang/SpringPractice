<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-11-14
  Time: 下午4:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${name}

<br>

<c:if test="${allErrors != null}" >
    <c:forEach var="error" items="${allErrors}">
        ${error.defaultMessage}
    </c:forEach>
</c:if>
<br>
<form action="${pageContext.request.contextPath}/validation">
    <input type="text" name="testName" />
    <input type="submit" value="测试"/>
</form>
</body>
</html>
