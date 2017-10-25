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
    <form >
        <input    placeholder="学生学号 :${stu.id}" id="Userame" readonly/>
        <input    placeholder="学生姓名 :${stu.name}" id="Name" readonly/>
        <input    placeholder="班级名称 :${stu.className}"   readonly/>
        <input    placeholder="考试科目 :语文"   readonly/>
        <input    placeholder="考试日期 :${stu.examDate}"   readonly/>
        <input    placeholder="考试编号 :${stu.examId}"   readonly/>

        <div class="send-button w3layouts agileits">

           <a href="${pageContext.request.contextPath}/WEB-INF/jsp/student_joinIN.jsp"> <input type="submit" value="报考"  />
           </a>

        </div>
    </form>
</div>






</body>
<!-- //Body -->

</html>