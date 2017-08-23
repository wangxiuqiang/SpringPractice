<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-8-20
  Time: 上午8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>修改员工信息</title>
</head>
<body>
<h2>修改${dept.name}的员工信息</h2>
<form:form commandName="staffUpdate" action="${pageContext.request.contextPath}/update_staff/${dept.id}" method="post">
    <table>
        <tr>
            <td>
                <label for="id">编号:</label>
                <form:input path="id"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="name">姓名</label>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="tel">电话</label>
                <form:input path="tel"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="money">薪水</label>
                <form:input path="money"/>
            </td>
        </tr>
        <tr>
            <td>
                 <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
