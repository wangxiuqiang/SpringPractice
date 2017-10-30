<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-30
  Time: 下午7:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考试报名</title>
</head>
<body>
<c:if test="${flag == 1}">
    不能给别人报名考试,请输入自己的学号,点击<a href="${pageContext.request.contextPath}/student_exam/${id}">返回 </a>
</c:if>
<c:if test="${flag == 0}">
    已经报名成功,不需要重复报名,点击<a href="${pageContext.request.contextPath}/student_exam/${id}">返回 </a>
</c:if>
</body>
</html>
