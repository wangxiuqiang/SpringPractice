<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 18-1-28
  Time: 下午4:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/picture" enctype="multipart/form-data">
    <c:if test="${pic != null}">
        a
    </c:if>
    <input type="file" name="pic" />
    <hr />
    <input type="file" name="pic" />
    <input type="submit" value="submit" />
</form>
</body>
</html>
