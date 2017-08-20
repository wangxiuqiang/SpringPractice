
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>${dept.name}管理</title>
</head>
<body>
<div id="div1" style="left: 500px; top: 400px; border: 2px; border-color: black;">
    <table>
        <tr>
            <td>
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
