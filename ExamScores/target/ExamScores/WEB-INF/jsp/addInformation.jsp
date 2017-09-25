<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-9-17
  Time: 上午9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加信息</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        .header {
            height: 150px;
            background-color: orange;
        }

        .footer {
            height: 160px;
            background-color: purple;
        }

        .text {
            border-color: skyblue;
            width: 181px;
            height: 20px;
            display: inline-block;
            margin-top: 30px;
            border-radius: 5px;
        }

        .middle {
            width: 300px;
            height: 330px;
            margin:30px auto;

        }
        h3 {
            font-size:30px;
        }
        .button {
            border-radius: 10px 10px 10px 10px;
            width:80px;
            height:30px;
            display: inline-block;
            margin-top: 20px;
            margin-left: 55px;
            color:black;
            font-size: 16px;
        }
    </style>
</head>
<body>
<!--表单结构-->
<%--表单结构    通过flag的值来确定显示哪个表单 , 表单是对学生和老师的信息的添加 --%>
<div class="header"> </div>
<h3>请输入 信息</h3>
<%--<%!  Integer flag;%>--%>
<%--<%--%>
    <%--flag = (Integer) request.getAttribute("flag");--%>
    <%--if(flag==0){--%>
<%--%>--%>
<c:if test="${flag ==1}  ">
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
</c:if>

<%--<% }else if(flag ==1){--%>
<%--%>--%>
<c:if test="${flag == 0}">
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
