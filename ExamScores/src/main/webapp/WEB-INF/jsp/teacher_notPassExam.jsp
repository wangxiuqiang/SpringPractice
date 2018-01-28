
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>学生成绩录入</title>

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
                            <p class="pricing-title">补考名单</p>

                        </div>
                        <table >
                            <th height="30px" width="70px" style="font-size: 20px; color: orange;">编号</th>
                            <th height="30px" width="70px" style="font-size: 20px; color: orange;">姓名</th>
                            <th height="30px" width="70px" style="font-size: 20px; color: orange;">班级</th>
                            <th height="30px" width="70px" style="font-size: 20px; color: orange;">科目</th>
                            <th height="30px" width="70px" style="font-size: 20px; color: orange;">成绩</th>
                            <th height="30px" width="70px" style="font-size: 20px; color: orange;">状态</th>
                            <c:forEach items="${listStu}" var="stu" >
                                <c:if test="${stu.groud < 60}">
                                <tr>
                                    <td  height="30px" width="70px" valign="center" style="color: white;font-size: 20px;">
                                            ${stu.id}</td>
                                    <td  height="30px" width="70px" valign="center" style="color: white;font-size: 20px;">
                                            ${stu.name}</td>
                                    <td  height="30px" width="70px" valign="center" style="color: white;font-size: 20px;">
                                            ${stu.className}</td>
                                    <td  height="30px" width="70px" valign="center" style="color: white;font-size: 20px;">
                                        语文</td>
                                    <td  height="30px" width="70px" valign="center" style="color: white;font-size: 20px;">
                                            ${stu.groud}</td>
                                    <td><a href="${pageContext.request.contextPath}/teacher_writeScoreOne/${stu.id}" style="color: red;">更改 </a></td>
                                </tr>
                                </c:if>
                            </c:forEach>
                            <tr>
                                <td>
                                    <a href="${pageContext.request.contextPath}/backTeacher_joinIN"><input type="button" value="返回"/> </a>
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
