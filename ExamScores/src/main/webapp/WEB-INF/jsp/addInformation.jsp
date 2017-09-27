<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-9-17
  Time: 上午9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加信息</title>
    <link href="${pageContext.request.contextPath}/css/addInformation.css" rel="stylesheet">
</head>
<body>

<div class="header"> </div>
<h3>请输入 信息</h3>

<c:if test="${flag == 0}">
<form:form commandName="student" method="post" action="${pageContext.request.contextPath}/addSubmit_Information/0">
    <div class="middle">
        <table>
            <tr>
                <td>
                    <label for="id">编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:
                        <form:input cssClass="text" path="id"  />
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="name">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:
                        <form:input path="name" cssClass="text"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="className">班&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;级:
                        <form:input path="className"  cssClass="text"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="classId">班级编号:
                        <form:input path="classId"  cssClass="text"/>
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
                <td><input type="submit" value="添加" class="button"/>
                    <input type="reset" value="重置" class="button" />
                </td>

            </tr>
        </table>
    </div>
</form:form>

<%--<% }else if(flag == 1 ){--%>
<%--%>--%>
</c:if>
<c:if test="${flag == 1 }">
<form:form commandName="teacher" method="post" action="${pageContext.request.contextPath}/addSubmit_Information/1">
<div class="middle">
    <table>
        <tr>
            <td>
                <label for="id">编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:
                    <form:input path="tid"  cssClass="text" />
                </label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="name">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:
                    <form:input path="tname" cssClass="text"/>
                </label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="name">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:
                    <form:input path="tpassword" cssClass="text"/>
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
</c:if>
<%--<%--%>
    <%--}--%>
    <%--%>--%>
<div class="footer"></div>
</body>
</html>
