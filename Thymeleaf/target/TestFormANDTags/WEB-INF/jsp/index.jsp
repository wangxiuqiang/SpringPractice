<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 2018/1/25
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>表单</title>
   <style type="text/css">
       .errorinput {
           color: red;
       }

       .a {
           color: blue;
       }
       .t {
           background-color: red;
       }
   </style>
</head>
<body>
<form:form commandName="test" action="${pageContext.request.contextPath}/login" method="post">
    <table>
        <tr>
            <td>
                <form:label path="id" cssErrorClass="a">id:</form:label>

            </td>
            <td>
                <form:input path="id" cssErrorClass="t"/>
                <form:errors path="id" cssClass="errorinput" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="name" cssErrorClass="a">name: </form:label>
            </td>
            <td>
                <form:input path="name" cssErrorClass="t"/>
                <form:errors path="name" cssClass="errorinput" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="submit"/>
            </td>
        </tr>
    </table>
</form:form>

<a href="<t:url value="/urlTestSuccess" />">sdfd</a>
</body>
</html>
