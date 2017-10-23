<%--
 教师单个输入成绩的页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>jQuery Contact Form Plugin: FFForm</title>
    <link href="${pageContext.request.contextPath}/css/demo.css" rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--Framework-->
    <script src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-ui.js" type="text/javascript"></script>
    <!--End Framework-->
    <script src="${pageContext.request.contextPath}/js/jquery.ffform.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#form').ffform({ animation: 'flip', submitButton: '#submit', validationIndicator: '#validation', errorIndicator: '#error', successIndicator: '#success', 'fields': [{ 'id': 'name', required: true, requiredMsg: 'Name is required', type: 'alpha', validate: true, msg: 'Invalid Name' }, { 'id': 'email', required: true, requiredMsg: 'E-Mail is required', type: 'email', validate: true, msg: 'Invalid E-Mail Address' }, { 'id': 'phone', required: false, type: 'custom', validate: false, msg: 'Invalid Phone #' }, { 'id': 'message', required: false, type: 'text', validate: false, msg: ''}] });
        });
    </script>
</head>
<body>
<section id="getintouch" class="fadeInRightBig animated">
    <div class="container" style="border-bottom: 0;">
        <h1>
            <span>成绩管理系统</span>
        </h1>
    </div>
    <div class="container">
        <form class="contact" action="#" method="post" id="form">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="name">
                        姓名</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="name" name="name" data-required="true" data-validation="text"
                    >
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="email">
                        学号</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="email" name="email" data-required="true" data-validation="id"
                    >
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="class">
                        班级</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="class" name="class" data-required="true" data-validation="custom" >
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="subject">
                        科目</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="subject" id="subject">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="grade">
                        成绩</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="grade" id="grade" >
                </div>
            </div>
            <div align="center">
                <a href="">
                    <input type="submit"  value="确定" style="height: 40px; width: 80px;"  />
                </a>
            </div>
            </button>
        </form>

    </div>
</section>
<span class="contact">

</span>
<span class="fadeInRightBig animated">

</span>
</body>
</html>