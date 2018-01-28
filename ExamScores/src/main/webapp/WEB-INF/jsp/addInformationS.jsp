<%--
    用来添加学生的信息
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加学生信息</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <!-- Main Style -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/query.css">
</head>

<body>
<!-- Pricing Table Section -->
<section id="pricing-table">
    <div class="container">
        <div class="row">
            <div class="pricing">
                <div class="col-md-4 col-sm-12 col-xs-12">
                    <div class="pricing-table">
                        <img src="${pageContext.request.contextPath}/images/11.jpg">
                        <div class="pricing-list">
                            <ul>
                                <li><i class="fa fa-envelope"></i>要么1，要么0！
                                <li><i class="fa fa-signal"></i><span>你们是0 我们是1 你我携手 能编世界</span>

                            </ul>
                        </div>

                    </div>
                </div>

                <div class="col-md-4 col-sm-12 col-xs-12">
                    <div class="pricing-table">
                        <div class="pricing-header">
                            <p class="pricing-title">添加学生信息</p>

                        </div>
                        <form:form commandName="student" method="post" action="${pageContext.request.contextPath}/addSubmit_Information/0">

                                <table style="color:  white;">
                                    <tr>
                                        <td>
                                            <label for="id">编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:
                                                <form:input cssClass="text" path="id"/>
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
                                        <td align="center" ><input type="submit" value="添加" class="button"/>
                                          &nbsp;
                                          &nbsp;
                                          &nbsp;
                                          &nbsp;  <input type="reset" value="重置" class="button" />
                                        </td>

                                    </tr>
                                </table>
                        </form:form>

                    </div>
                </div>

                <div class="col-md-4 col-sm-12 col-xs-12">
                    <div class="pricing-table">
                        <img src="${pageContext.request.contextPath}/images/22.jpg">
                        <div class="pricing-list">
                            <ul>
                                <li><i class="fa fa-envelope"></i>扬理想之风帆，抵成功之彼岸.
                                <li><i class="fa fa-signal"></i><span>在学习中学会怎么玩的痛快，在玩闹中懂得怎么学的潇洒.</span>

                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Pricing Table Section End -->
</body>
</html>

