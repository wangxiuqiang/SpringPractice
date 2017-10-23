<%--
登录页面 , 根据需要确认哪个级别的人物登录 ,用flag控制 ，管理员2,老师是1 ，学生为0
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>

<!-- Head -->
<head>

    <title>学生登录</title>

    <!-- Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //Meta-Tags -->

    <!-- Style --> <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" media="all">



</head>
<!-- //Head -->

<!-- Body -->
<body>

<h1></h1>

<div class="container w3layouts agileits">


    <h2>学生登录</h2>
    <br><br><br><br>
    <div style="width:100%;text-align:center">
        <form:form action="${pageContext.request.contextPath}/tsJoin_in/0" method="post" commandName="joinTS" >
            <form:input path="id" type="text"   id = "Userame" onfocus="javascript:this.value=''"  placeholder="学号" />
            <form:password  path="password" id = "Password" onfocus="javascript:this.value=''" placeholder="密码" />


        <ul class="tick w3layouts agileits">
            <li>
                <input type="checkbox" id="brand1" value="">
                <label for="brand1"><span></span>记住我</label>
            </li>
        </ul>
        <div class="send-button w3layouts agileits">

                <input type="submit" value="登 录"/>

            </form:form>
        </div>
    </div>






</body>
</html>