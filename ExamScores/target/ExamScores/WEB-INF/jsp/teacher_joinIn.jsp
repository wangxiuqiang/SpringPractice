<%--
     教师登录后的信息
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>教师管理页面</title>

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
                            <p class="pricing-title">teacher</p>

                            <table cellpadding="5">
                                <tr>&nbsp;</tr>
                                <tr>
                                    <td colspan="2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/teacher_allSelectStu" >
                                        <input type="submit"  value="录入成绩" size="16"/>
                                    </a>
                                    </td>
                                    <td colspan="2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/query_notPass" >
                                        <input type="submit"  value="补考名单"  size="16"/>
                                    </a></td>
                                    <td colspan="2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/teacher_allSelectStu">
                                        <input type="submit"  value="查询学生信息" size="16"/>
                                    </a></td>

                                </tr>
                                <tr>
                                    <td colspan="2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/teacher_changePasswd" >

                                        <input type="submit"  value="更改密码"  size="16"/>
                                    </a>
                                    </td></tr>
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