<%--
  管理员登录成功界面,对老师学生的全面管理

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<meta charset="UTF-8">
<head>
    <title>考试管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/adminIn.css" type="text/css"/>
</head>
<body>
<div class="header">插个图片</div>
<div class="middle">
    <table cellspacing="0" >

        <tr >
            <th>
                对老师的管理
            </th>
            <th>
                对学生的管理
            </th>
        </tr>
        <tr align="center">
            <td >
                <a href="query_Information/1">查询信息</a>
            </td>
            <td>
                <a href="#">查询信息</a>
            </td>
        </tr>
        <tr align="center">
            <td>
                <%--删除信息  -1 是老师, 0 是学生 修改信息 2 是老师,1是学生--%>
                <a href="update_delete/-1" >删除信息</a>
            </td>
            <td>
                <a href="update_delete/0" >删除信息</a>
            </td>
        </tr>
        <tr align="center">
            <td>
                <a href="update_delete/2">修改信息</a>
            </td>
            <td>
                <a href="update_delete/1">修改信息</a>
            </td>
        </tr>
        <tr align="center">
            <td>
                <a href="add_information/1">添加信息</a>
            </td>
            <td>
                <a href="add_information/0">添加信息</a>
            </td>
        </tr>
    </table>
</div>
<div class="footer">图片</div>
</body>
</html>

