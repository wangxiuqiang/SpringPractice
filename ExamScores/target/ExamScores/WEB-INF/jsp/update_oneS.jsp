<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-13
  Time: 下午9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>修改学生信息</title>
    <style type="text/css" >
        @import  url("<c:url value="/css/addInformation.css"/>");
    </style>
</head>
<body>

<div class="header"> </div>
<h3>请输入 信息</h3>
<form:form commandName="student" method="post" action="${pageContext.request.contextPath}/update_success/0">
    <div class="middle">
        <table>
            <tr>
                <td>
                    <label for="id">编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:
                        <form:input cssClass="text" path="id" htmlEscape="true" value = "${student.id}"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="name">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:
                        <form:input path="name" cssClass="text" htmlEscape="true" value = "${student.name}"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="className">班&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;级:
                        <form:input path="className"  cssClass="text" htmlEscape="true" value = "${student.className}"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="classId">班级编号:
                        <form:input path="classId"  cssClass="text" htmlEscape="true" value = "${student.classId}"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:
                        <form:input path="password" cssClass="text"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="修改" class="button"/>
                    <input type="reset" value="重置" class="button" />
                </td>

            </tr>
        </table>
    </div>
</form:form>

<div class="footer"></div>
</body>
</html>
