<%--
   管理员添加信息成功窗口，可以改为老师添加成绩一起的窗口
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>添加成功</title>
</head>
<body>
添加信息成功 , 添加的信息为${flag}
老师信息为 ${teacher.name}
${teacher.id}
${teacher.zpassword}

</body>
</html>
