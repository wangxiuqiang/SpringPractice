<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录失败</title>
</head>
<body>
<%--11(空) 12(不匹配) 是学生
    21 22 老师
    31 32 管理员
--%>
<c:if test="${flagJoin == 11 || flagJoin == 21 || flagJoin == 31}">
    用户名或密码不能为空
    <c:if test="${flagJoin == 11}">,点击
        <a href="${pageContext.request.contextPath}/join_in/0">返回</a>
    </c:if>
    <c:if test="${flagJoin == 21}">,点击
        <a href="${pageContext.request.contextPath}/join_in/1">返回</a>
    </c:if>
    <c:if test="${flagJoin == 31}">,点击
        <a href="${pageContext.request.contextPath}/join_in/2">返回</a>
    </c:if>
</c:if>
<c:if test="${flagJoin == 12 || flagJoin == 22 || flagJoin == 32}">
    用户名和密码不匹配
    <c:if test="${flagJoin == 12}">,点击
        <a href="${pageContext.request.contextPath}/join_in/0">返回</a>
    </c:if>
    <c:if test="${flagJoin == 22}">,点击
        <a href="${pageContext.request.contextPath}/join_in/1">返回</a>
    </c:if>
    <c:if test="${flagJoin == 32}">,点击
        <a href="${pageContext.request.contextPath}/join_in/2">返回</a>
    </c:if>
</c:if>

</body>
</html>
