<%--
登录页面 , 根据需要确认哪个级别的人物登录
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>请登录</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        /*.BackDiv {*/
            /*background-image: url(//images/beijing.jpeg);*/
            /*-webkit-filter: blur(3px);*/
            /*-moz-filter: blur(2px);*/
            /*-o-filter: blur(2px);*/
            /*-ms-filter: blur(2px);*/
            /*height: 700px;*/
            /*z-index: 1;*/
            /*margin: 0 auto;*/
            /*!*background-size: cover;*!*/

        /*}*/
        .FormDiv {
            position: absolute;
            left:40%;
            top: 43%;
            z-index: 2;
            border-radius: 15px 15px 15px 15px;
            border-style: none;
            width: 350px;
            height: 180px;
            float: left;
            background-color: white;
        }
        input[class^="t"] {
            border-style: solid;
            font-size:15px;
            border-radius: 15px 15px 15px 15px;
            border-color: gray;
            margin-left:15px;
            width: 210px;
            height: 30px;
            display: inline-block;
            margin-top: 15px;
        }
        p {
            margin-left: 20px;
            display: inline-block;
        }

        input[class^="b"] {
            border-radius: 10px 10px 10px 10px;
            width:80px;
            height:30px;
            display: inline-block;
            margin-top: 20px;
            margin-left: 55px;
            color:black;
            font-size: 16px;
        }

        .HeadDiv {
            float: left;
            z-index: 3;
            font-size: 35px;
            width: 600px;
            height: 100px;
            position: absolute;
            left: 31%;
            top: 30%;
        }
        .ChooseDiv div {
            float: left;
            border:none;
            margin-left: 3px;
        }
        .ChooseDiv div a{
            text-decoration: none;
            color: gray;
        }
        .ChooseDiv div a:hover {
            color: red;
        }

    </style>
</head>
<body>
<div class="HeadDiv">某大学计算机学院考试成绩查询系统</div>

<div ></div>

<div class="FormDiv">
    <div class="ChooseDiv">
        <div><a href="#">管理员登录</a></div>
        <div><a href="#">教师登录</a></div>
        <div><a href="#">学生登录</a></div>
    </div>
    <form:form commandName="join" id="join" action="success_in" method="post">
        <table>
            <tr>
                <td>
                    <p >
                        用户名: <form:input class="tText" path="name" placeholder="请输入学号" htmlEscape="true"/>
                    </p>
                </td>
            </tr>
            <tr>
                <td>

                    <p>
                        密&nbsp;&nbsp;&nbsp;&nbsp;码: <form:password cssClass="tPassword" path="passwd" placeholder="请输入密码" />
                    </p>
                </td>
            </tr>
            <tr>
                <td>
                    <input class="bSubmit" type="submit" value="登录" />
                    <input  class="bReset" type="reset" value="重置" />
                </td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
