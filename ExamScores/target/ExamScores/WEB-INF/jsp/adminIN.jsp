<%--
  管理员登录成功界面,对老师学生的全面管理

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
    <title>欢迎管理员登录</title>

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
                            <p class="pricing-title">欢迎管理员登录</p>

                        </div>
                        <table cellspacing="0" style="font-size: 20px;">

                            <tr >
                                <th style="font-size: 18px; color: white;">
                                    对老师的管理
                                </th>
                                <th style="font-size: 18px; color: white; " align="center">
                                    对学生的管理
                                </th>
                            </tr>
                            <tr align="center">
                                <td >
                                    <a href="query_Information/1">查询信息</a>
                                </td>
                                <td>
                                    <a href="query_Information/0">查询信息</a>
                                </td>
                            </tr>
                            <tr align="center">
                                <td>
                                    <%--删除信息  -1 是老师, 0 是学生 修改信息 2 是老师,1是学生--%>
                                    <a href="update_delete/-1" >删除信息</a>
                                </td>
                                <td>
                                    <a href="update_delete/0" >删除信息</a>
                                </td>
                            </tr>
                            <tr align="center">
                                <td>
                                    <a href="update_delete/2">修改信息</a>
                                </td>
                                <td>
                                    <a href="update_delete/1">修改信息</a>
                                </td>
                            </tr>
                            <tr align="center">
                                <td>
                                    <a href="add_information/1">添加信息</a>
                                </td>
                                <td>
                                    <a href="add_information/0">添加信息</a>
                                </td>
                            </tr>
                        </table>
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