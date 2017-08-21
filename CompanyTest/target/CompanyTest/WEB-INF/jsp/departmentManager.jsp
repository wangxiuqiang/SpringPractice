
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="pageContext.request.contextPath"/>
<html>
<head>
    <title>${dept.name}管理</title>
</head>
<body>
<h2>${dept.name}管理</h2>
<div id="div1" style="left: 500px; top: 400px; border: 2px; border-color: black;">
    <table>
        <tr>
            <td>

                <!--  第一个参数表示跳转到的页面 1 是添加  2是 删除  3 是 查询 4 是修改 ,第二个参数是用来
                      表示哪个部门的修改
                -->
                <a href="${pageContext.request.contextPath}/manager/1/${dept.id}"> 添加</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/manager/2/${dept.id}">   删除</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/manager/3/${dept.id}"> 查询</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/manager/4/${dept.id}">  修改</a>
            </td>
        </tr>

    </table>
</div>
</body>
</html>
