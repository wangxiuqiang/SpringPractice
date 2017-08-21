<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-8-21
  Time: 上午8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>success</title>
</head>
<body>
${str}
<a href="${pageContext.request.contextPath}/change_view/${id}">点击返回上一页面</a>
</body>
</html>
