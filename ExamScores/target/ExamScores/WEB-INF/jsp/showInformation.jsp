<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>信息</title>

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
                            <c:if test="${flag== 1}" >
                            <p class="pricing-title">教师信息查询</p>
                            </c:if>
                            <c:if test="${flag== 0}" >
                                <p class="pricing-title">学生信息查询</p>
                            </c:if>
                        </div>

                        <c:if test="${flag== 1}" >
                            <div class="middle">
                                <table border="2px" width="330px;" >
                                    <tr style="color: orange; font-size: 21px;">
                                        <th>编号</th>
                                        <th>姓名</th>
                                        <th>密码</th>
                                    </tr>
                                    <c:forEach items="${teachers}" var="teacher">

                                        <tr style="color: #d2322d; font-size: 18px; font-weight: bold;">
                                            <td ><%--<c:out value="${teacher.id}"/> 两种方法都行--%>
                                                    ${teacher.id}
                                            </td>
                                            <td >
                                                <c:out value="${teacher.name}"/>
                                            </td>
                                            <td >
                                                <c:out value="${teacher.password}"/>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </div>
                        </c:if>
                        <c:if test="${flag==0}">
                        <div class="middle">
                            <table border="2px" width="300px;" >
                                <tr style="color: orange; font-size: 18px;">
                                    <th>编号</th>
                                    <th>姓名</th>
                                    <th>密码</th>
                                    <th>班级</th>
                                    <th>班级编号</th>
                                </tr>
                            <c:forEach items="${students}" var="stu">
                                <tr style="color: #d2322d; font-size: 16px; font-weight: bold;">
                                    <td ><%--<c:out value="${teacher.id}"/> 两种方法都行--%>
                                            ${stu.id}
                                    </td>
                                    <td >
                                        <c:out value="${stu.name}"/>
                                    </td>
                                    <td >
                                        <c:out value="${stu.password}"/>

                                    <td >
                                        <c:out value="${stu.className}"/>
                                    </td>
                                    <td >
                                        <c:out value="${stu.classId}"/>
                                    </td>
                                </tr>
                            </c:forEach>
                            </table>
                        </div>
                        </c:if>

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

</body>
</html>