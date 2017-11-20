<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-11-17
  Time: 上午11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page isELIgnored="false" %>

<html>
<head>
    <title>json数据测试</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/WEB-INF/js/jquery-1.4.4.min.js"/>
    <script type="text/javascript" >

        function requestJson() {
            $.ajax(
                {
                    type:'post',
                    url:'${pageContext.request.contextPath}/requestJson',
                     contentType:'application/json;charset=utf-8',
                    data:'{"name":"手机","price":999}',
                    success:function (data) {
                        alert(data);
                    }

                }
            );
        }

        function requestKey() {
            $.ajax(
                {
                    type:'post',
                    url:'${pageContext.request.contextPath}/responseJson',
                    data:'name="手机",price=999',
                    success:function (data) {
                        alert(data);
                    }

                }
            );
        }
        function a() {
            var a = 3;
            var b = 4;
            alert("a = b");
        }
    </script>
</head>
<body>

       <input type="button" value="测试json数据" onclick="requestJson()" />

       <hr />
       <input type="button" value="测试key/value数据" onclick="requestKey()"/>

       <input type="button" value="测试" onclick="a()"/>


</body>
</html>
