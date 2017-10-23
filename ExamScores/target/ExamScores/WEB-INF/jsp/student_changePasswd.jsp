<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-23
  Time: 下午5:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
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
                            <p class="pricing-title">学生更改密码</p>

                            <table cellpadding="5">
                                <tr>&nbsp;</tr>
                                <tr>
                                    <td>用户名:</td>
                                    <td><input name="mingzi" type="text" maxlength="8" size="20"/></td>
                                </tr>
                                <tr>
                                    <td>原密码:</td>
                                    <td><input name="mima" type="password" maxlength="8" size="20"/></td>
                                </tr>
                                <tr>
                                    <td>新密码:</td>
                                    <td><input name="mima" type="password" maxlength="8" size="20"/></td>
                                </tr>
                                <tr>
                                    <td>确认密码:</td>
                                    <td><input name="mima" type="password" maxlength="8" size="20"/></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td colspan="2" align="center"><a href="log on.html" target="_blank">
                                        <input type="submit" name="submit3" value="确认" maxlength="8" size="20"/>
                                    </a>&nbsp;
                                        <a href="log on.html" target="_blank"><input type="submit" name="submit2" value="重置" /></a>                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
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
