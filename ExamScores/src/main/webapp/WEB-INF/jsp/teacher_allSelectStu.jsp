
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ page isELIgnored="false" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Startup Framework Inspired Pricing Table</title>

            <!-- Bootstrap -->
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

            <!-- Main Style -->
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
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
                            <p class="pricing-title">选择学生进行成绩录入</p>

                        </div>
                    <table >
                        <th>编号</th>
                        <th>姓名</th>
                        <th>班级</th>
                        <th>科目</th>
                        <th>成绩</th>
                        <th>状态</th>
                        <c:forEach items="${listStu}" var="stu" >
                            <tr>
                                <td width="30px" valign="center">${stu.id}</td>
                                <td width="30px" valign="center">${stu.name}</td>
                                <td width="30px" valign="center">${stu.className}</td>
                                <td width="30px" valign="center">语文</td>
                                <td width="30px" valign="center">${stu.groud}</td>
                                <a href="">
                                    <td>更改</td>
                                </a>
                            </tr>
                        </c:forEach>

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
