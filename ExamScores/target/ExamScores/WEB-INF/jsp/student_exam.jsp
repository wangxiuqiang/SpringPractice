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
    <form action="#" method="post">
        <input type="text" Name="Subject" onFocus="javascript:this.value=''" placeholder="报考科目" id="Subject" required="">
        <input type="text" Name="Name" onFocus="javascript:this.value=''" placeholder="学生姓名" id="Name" required="">
        <input type="text" Name="Userame" onFocus="javascript:this.value=''" placeholder="学号" id="Userame" required="">
    </form>
    <div class="send-button w3layouts agileits">
        <form>
            <input type="submit" value="报考"  />

        </form>
    </div>
</div>






</body>
<!-- //Body -->

</html>