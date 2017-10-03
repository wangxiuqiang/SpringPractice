<%--
登录页面 , 根据需要确认哪个级别的人物登录 ,用flag控制 ，管理员2,老师是1 ，学生为0
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>请登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" type="text/css"/>
</head>
<body>
<div class="HeadDiv">某大学计算机学院考试成绩查询系统</div>

<div class="BackDiv"></div>

<div class="FormDiv">
    <div class="ChooseDiv">
        <div><a href="#">管理员登录</a></div>
        <div><a href="#">教师登录</a></div>
        <div><a href="#">学生登录</a></div>
    </div>
    <form:form commandName="join" id="join" action="success_in" method="post">
        <table>
            <tr>
                <td>
                    <p >
                        用户名: <form:input class="tText" path="name" placeholder="请输入学号" htmlEscape="true"/>
                    </p>
                </td>
            </tr>
            <tr>
                <td>

                    <p>
                        密&nbsp;&nbsp;&nbsp;&nbsp;码: <form:password cssClass="tPassword" path="password" placeholder="请输入密码" />
                    </p>
                </td>
            </tr>
            <tr>
                <td>
                    <input class="bSubmit" type="submit" value="登录" />
                    <input  class="bReset" type="reset" value="重置" />
                </td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
