<%--
  教师单个查询的页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>MOBAN</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css' />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="App Loction Form,Login Forms,Sign up Forms,Registration Forms,News latter Forms,Elements"./>
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!--webfonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <!--//webfonts-->
</head>
<body>
<h1>成绩管理系统</h1>
<div class="app-location">
    <h2>成绩管理系统</h2>
    <div class="line"><span></span></div>
    <div class="location"><img src="${pageContext.request.contextPath}/images/location.png" class="img-responsive" alt="" /></div>
    <form:form commandName="key" method="post" >
             <form:input  placehodler="学号" htmlEscape="true" path="id" />
        <div class="submit"><input type="submit" onClick="myFunction()" value="查询"  >
            <select name="查询"  >
            <script type="text/javascript">function myFunction(){  window.location.href='techer_writeOne'}</script>
            </select>
        </div>
       </form:form>

</div>
</body>
</html>