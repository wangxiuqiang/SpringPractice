<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-23
  Time: 下午5:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<!-- Head -->
<head>

    <title>学生报考</title>

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

<h1>报考信息</h1>

<div class="container w3layouts agileits">
    <form:form action="${pageContext.request.contextPath}/student_examSuccess/${stu.id}" method="post" commandName="stu">
        <form:input path="lesson" placeholder="语文" id="Subject" />
        <form:input path="id"   placeholder="学号" id="Userame" />
        <form:input path="name" placeholder="学生姓名" id="Name" />
        <form:input path="className"   placeholder="班级"  />
        <form:input path="examDate" placeholder="考试日期" />
        <form:input path="exmaId"   placeholder="考试编号"  />
        <div class="send-button w3layouts agileits">
            <input type="submit" value="返回"  />
        </div>
    </form:form>
</div>

</body>
</html>