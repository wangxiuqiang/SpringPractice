

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>
        <c:if test="${flag == 11 || flag == 21 }">
            修改成功
        </c:if>
        <c:if test="${flag == 12 || flag == 22 }">
            修改失败
        </c:if>
    </title>
</head>
<body>
<c:if test="${flag == 11 || flag == 21 }">
     密码修改成功,点击
    <c:if test="${flag == 11}">
        <a href="${pageContext.request.contextPath}/tsJoin_in/0">返回</a>
    </c:if>
    <c:if test="${flag == 21}">
        <a href="${pageContext.request.contextPath}/tsJoin_in/1">返回</a>
    </c:if>
</c:if>
<c:if test="${flag == 12 || flag == 22 }">
     密码修改失败,点击
    <c:if test="${flag == 12}">
        <a href="${pageContext.request.contextPath}/student_changePasswd">返回</a>
    </c:if>
    <c:if test="${flag == 22}">
        <a href="${pageContext.request.contextPath}/teacher_changePasswd">返回</a>
    </c:if>
</c:if>
</body>
</html>
