<%--
    修改和删除的初始页面,如果返回的值是1,2, 就执行修改的部分,修改的部分也分为学生和老师,
    删除 一样
    ,如果是0(学生),-1(老师),就执行delete的部分,保证
    在一个页面实现不同的展示,显示信息使用foreach方法

--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>
        <c:if test="${flag == 1}">修改学生信息</c:if>
        <c:if test="${flag == 2}">修改老师信息</c:if>
        <c:if test="${flag == 0}">删除学生信息</c:if>
        <c:if test="${flag == -1}">删除老师信息</c:if>
    </title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/">
</head>
<body>
<div class="header">插个图片</div>
<div class="table">
    <table>
        <tr>
            <td>
                编号
            </td>
            <td>
                姓名
            </td>
            <td>
                密码
            </td>

        </tr>
        <c:forEach items="teachers" begin="0" >
            <tr ></tr>
        </c:forEach>
    </table>
</div>
<div class="footer">图片</div>
</body>
</html>
