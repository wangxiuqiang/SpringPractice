<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-13
  Time: 下午8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>更改老师信息</title>
    <style type="text/css" >
        @import  url("<c:url value="/css/addInformation.css"/>");
    </style>
</head>

<body>
<div class="header"> </div>
<h3>请输入 信息</h3>

<form:form commandName="teacher" method="post" action="${pageContext.request.contextPath}/update_success/1">
    <div class="middle">
        <table>
            <tr>
                <td>
                    <label for="id">编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:
                        <form:input  path="id"  cssClass="text" htmlEscape="true" value="${teacher.id}"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="name">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:
                        <form:input path="name" cssClass="text" htmlEscape="true" value="${teacher.name}"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="name">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:
                        <form:input path="password" cssClass="text" htmlEscape="true" value="${teacher.password}"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="添加" class="button"/>
                    <input type="reset" value="重置" class="button" />
                </td>

            </tr>
        </table>
    </div>
</form:form>
<div class="footer"></div>
</body>
</html>
