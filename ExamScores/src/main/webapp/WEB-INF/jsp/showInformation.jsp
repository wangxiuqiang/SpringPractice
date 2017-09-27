<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-9-27
  Time: 下午7:29
  To change this template use File | Settings | File Templates.
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
