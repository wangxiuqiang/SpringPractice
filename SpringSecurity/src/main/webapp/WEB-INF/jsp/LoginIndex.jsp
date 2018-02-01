<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 18-2-1
  Time: 下午7:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/index" method="post" >
    <table>
        <tr>
            <td>
               用户名: <input type="text" name="username" value=""/>
            </td>
        </tr>
        <tr>
            <td>
                密码 :<input type="password" name="password" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="login"  />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
