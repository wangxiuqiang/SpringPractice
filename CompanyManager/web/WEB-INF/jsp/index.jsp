
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>黑锋企业员工管理系统</title>
  </head>
  <body>
  <h3> 欢迎管理员登录 </h3>
  <form:form commandName="admin" action="join_in" method="post">
  <table >
    <tr>
      <td>
        <label for="name">Name:</label>
        <form:input path="name" id="name"/>
      </td>
    </tr>
    <tr>
      <td>
        <label for="password" >Password: </label>
        <form:password path="password" id="password" showPassword="false"/>
      </td>
    </tr>
    <tr>
      <td>
        <input id="submit" type="submit" tabindex="4" value="Join">
        <input type="reset"  id="reset" tabindex="5">
      </td>
    </tr>
  </table>
  </form:form>
  </body>
</html>
