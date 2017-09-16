<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-9-16
  Time: 下午7:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<meta charset="UTF-8">
<head>
    <title>考试管理系统</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        a {
            color:  skyblue;
            text-decoration: none;
        }

        a:hover {
            color: red;
        }
        td {
            border: solid  red;

        }
        th {
            border: solid  red;
        }
        table {

            width: 500px;
            height: 300px;
            border-collapse: collapse;
        }

        .header {
            height: 150px;
            background-color: orange;
        }
        .middle {
            margin: 20px 380px;
            width: 300px;
            height:400px;

        }
        .footer {
            height: 120px;
            background-color: purple;
        }
    </style>
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
                <a href="#">查询信息</a>
            </td>
            <td>
                <a href="#">查询信息</a>
            </td>
        </tr>
        <tr align="center">
            <td>
                <a href="#" >删除信息</a>
            </td>
            <td>
                <a href="#" >删除信息</a>
            </td>
        </tr>
        <tr align="center">
            <td>
                <a href="#">修改信息</a>
            </td>
            <td>
                <a href="#">修改信息</a>
            </td>
        </tr>
        <tr align="center">
            <td>
                <a href="#">添加信息</a>
            </td>
            <td>

            </td>
        </tr>
    </table>
</div>
<div class="footer">图片</div>
</body>
</html>

