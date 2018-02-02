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
<form action="/test" method="post" >
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
                <input type="checkbox" name="remember-me"/>
                记住我
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
<%--</html>--%>
<%--<html><head><title>Login Page</title></head><body onload='document.f.username.focus();'>--%>
<%--<h3>Login with Username and Password</h3><form name='f' action='/test' method='POST'>--%>
    <%--<table>--%>
        <%--<tr><td>User:</td><td><input type='text' name='username' value=''></td></tr>--%>
        <%--<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>--%>
        <%--<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>--%>
    <%--</table>--%>
<%--</form></body></html>--%>