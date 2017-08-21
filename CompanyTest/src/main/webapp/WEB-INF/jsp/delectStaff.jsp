<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-8-20
  Time: 上午8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>删除员工</title>
</head>
<body>
     <form:form commandName="staffId" method="post" action="${pageContext.request.contextPath}/delete_staff/${dept.id}">
         <table>
             <tr>
                 <td>
                     <label for="id">要删除的员工id:</label>
                     <form:input path="id" id ="id"/>
                 </td>
             </tr>
             <tr>
                 <td>
                    <input type="submit" id="submit" value="submit"/>
                     <input type="reset" id="reset" value="reset"/>
                 </td>
             </tr>
         </table>
     </form:form>
</body>
</html>
