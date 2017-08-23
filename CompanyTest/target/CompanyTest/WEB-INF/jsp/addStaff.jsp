<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-8-20
  Time: 上午8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>添加员工</title>
     <script type="text/javascript" >
         function back(){
             window.location.href="${pageContext.request.contextPath}/change_view/${dept.id}";
         }
     </script>
</head>
<body>
<h2> 添加 ${dept.name}的成员</h2>
<!--   -->
    <form:form commandName="staffAdd" id="staff" method="post" action="${pageContext.request.contextPath}/add_Staff/${dept.id}">
        <table>
            <tr>
                <td>
                    <label for="name">姓名:</label>
                    <form:input path="name" id="name"/>
                 </td>
            </tr>
            <tr>
                <td>
                    <label for="id">编号:</label>
                    <form:input path="id" id="name"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="tel">电话:</label>
                    <form:input path="tel" id="name"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="money">薪水:</label>
                    <form:input path="money" id="name"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="submit" />
                    <input type="reset" value="reset" />
                    <input value="back" type="button" onclick="back()"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
