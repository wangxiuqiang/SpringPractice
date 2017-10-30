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

<h1>学生报考</h1>

<div class="container w3layouts agileits">

    <h2></h2>
    <div style="width:100%;text-align:center">
    <%--<form >--%>
        <%--<input value="学生学号 :${stu.id}" id="Userame" readonly/>--%>
        <%--<input value="学生姓名 :${stu.name}" id="Name" readonly/>--%>
        <%--<input value="班级名称 :${stu.className}"   readonly/>--%>
        <%--<input value="考试科目 :语文"   readonly/>--%>
        <%--<input value="考试日期 :${stu.examDate}"   readonly/>--%>
        <%--<input value="考试编号 :${stu.examId}"   readonly/>--%>
       <form:form  method="post" commandName="stu" action="${pageContext.request.contextPath}/student_backJoinIN/${stu.id}">
        <form:input path="lesson"      value="语文" id="Subject" />
        <form:input path="id"          value="学号:${stu.id}" />
        <form:input path="name"        value="学生姓名;${stu.name}"  />
        <form:input path="className"   value="专业班级:${stu.className}"  />
        <form:input path="examDate"    value="考试日期:${stu.examDate}" />
        <form:input path="examId"      value="考试编号:${stu.examId}"  />
        <div class="send-button w3layouts agileits">
           <input type="submit" value="返回"  />
        </div>
       </form:form>
    <%--</form>--%>
    </div>
</div>






</body>
<!-- //Body -->

</html>