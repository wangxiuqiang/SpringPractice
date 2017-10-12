<%--
    修改和删除的初始页面,如果返回的值是1,2, 就执行修改的部分,修改的部分也分为学生和老师,
    删除 一样
    ,如果是0(学生),-1(老师),就执行delete的部分,保证
    在一个页面实现不同的展示,显示信息使用foreach方法

--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false"%>
<html>
<head>
    <title>
        <c:if test="${flag == 1}">修改学生信息</c:if>
        <c:if test="${flag == 2}">修改老师信息</c:if>
        <c:if test="${flag == 0}">删除学生信息</c:if>
        <c:if test="${flag == -1}">删除老师信息</c:if>
    </title>
    <style type=" text/css" >
        @import  url("<c:url value="/css/update_Delete.css"/>");
    </style>
</head>
<body>
<div class="header">插个图片</div>
<div class="daohang">
    <table>
        <tr>
            <td><a href="#">学生信息查询</a></td>
            <td><a href="#">学生信息添加</a></td>
            <td><a href="#">学生信息修改</a></td>
            <td><a href="#">教师信息查询</a></td>
            <td><a href="#">教师信息添加</a></td>
            <td><a href="#">教师信息修改</a></td>
            <td></td>
        </tr>
    </table>
</div>
<div class="middle">

    <table border="3px">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>密码</th>
        </tr>
        <c:forEach items="${teachers}" var="teacher">

        <tr >
            <td width="100px"><%--<c:out value="${teacher.id}"/> 两种方法都行--%>
                ${teacher.id}
            </td>
            <td width="100px">
                <c:out value="${teacher.name}"/>
            </td>
            <td width="100px">
                <c:out value="${teacher.password}"/>
            </td>
            <td class="update_delete" width="50px">
                更改
            </td>
            <td class="update_delete" width="50px">
                删除
            </td>
        </tr>
        </c:forEach>
    </table>
</div>
<div class="footer">图片</div>
</body>
</html>
