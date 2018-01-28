<%--
 教师单个输入成绩的页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>录入信息展示</title>
    <link href="${pageContext.request.contextPath}/css/demo.css" rel="stylesheet" type="text/css">
</head>
<body>
<section id="getintouch" class="fadeInRightBig animated">
    <div class="container" style="border-bottom: 0;">
        <h1>
            <span>添加或修改信息成功</span>
        </h1>
    </div>
    <div class="container">

        <form:form class="contact" action="${pageContext.request.contextPath}/query_Information/1" commandName="teacher" htmlEscape="true" method="post" id="form">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="name">
                        姓名</label>
                </div>
                <div class="ctrl">
                    <form:input  path="name" id="name" name="name"
                                 htmlEscape="true" value="${teacher.name}" readOnly="true"/>
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="email">
                        编号</label>
                </div>
                <div class="ctrl">
                    <form:input path="id" id="email" name="email"
                                htmlEscape="true" value="${teacher.id}" readOnly="true"/>
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="email">
                        密码</label>
                </div>
                <div class="ctrl">
                    <form:input path="password" id="email" name="email"
                                htmlEscape="true" value="${teacher.id}" readOnly="true"/>
                </div>
            </div>


            <div align="center">

                <input type="submit"  value="返回" style="height: 40px; width: 80px;"  />

            </div>
        </form:form>
    </div>
</section>
<span class="contact">

</span>
<span class="fadeInRightBig animated">

</span>
</body>
</html>