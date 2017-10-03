<%--
 显示信息，    用来将老师或者学生的信息全部显示   ,也可以搜素学号进行显示
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>显示信息</title>
</head>
<body>
     <table>
         <tr>
             <td>${list.get(0).id}</td>
             <td>${list.get(1).name}</td>
             <td></td>

         </tr>

     </table>
</body>
</html>
