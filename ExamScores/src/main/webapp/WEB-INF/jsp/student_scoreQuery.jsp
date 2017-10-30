<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-23
  Time: 下午5:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>学生成绩查询</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <!-- Main Style -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mainTea.css">

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
                            <p class="pricing-title">学生成绩查询</p>

                            <table cellpadding="5">
                                <tr>&nbsp;</tr>
                                <tr>
                                    <td>学号:</td>
                                    <td><input  type="text" maxlength="8" size="20" value="${stu.id}" readonly style="width: 150px"/></td>
                                </tr>

                                <tr>
                                    <td>班级:</td>
                                    <td><input  type="text" maxlength="8" size="20" value="${stu.className}" readonly style="width: 150px"/></td>
                                </tr>
                                <tr>
                                    <td>姓名:</td>
                                    <td><input  type="text" maxlength="8" size="20" value="${stu.name}" readonly style="width: 150px"/></td>
                                </tr>
                                <tr>
                                    <td>科目:</td>
                                    <td><input type="text" maxlength="8" size="20" value="语文" readonly style="width: 150px"/></td>
                                </tr>
                                <tr>
                                    <td>成绩:</td>
                                    <td><input  type="text" maxlength="8" size="20" value="${stu.groud}" readonly style="width: 150px"/></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td colspan="2" align="center"><a href="${pageContext.request.contextPath}/student_backJoinIN/${stu.id}" >
                                        <input type="submit" name="submit3" value="返回" maxlength="8" size="20"/>
                                    </a>&nbsp;
                                </tr>
                            </table>

                        </div>
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
