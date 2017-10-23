<%--
    修改和删除的初始页面,如果返回的值是1,2, 就执行修改的部分,修改的部分也分为学生和老师,
    删除 一样
    ,如果是0(学生),-1(老师),就执行delete的部分,保证
    在一个页面实现不同的展示,显示信息使用foreach方法

--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page isELIgnored="false"%>
<html>
<head>
    <title>
        <c:if test="${flag == 1}">修改学生信息</c:if>
        <c:if test="${flag == 2}">修改老师信息</c:if>
        <c:if test="${flag == 0}">删除学生信息</c:if>
        <c:if test="${flag == -1}">删除老师信息</c:if>
    </title>
    <style type="text/css" >
        @import  url("<c:url value="/css/update_Delete.css"/>");
    </style>
</head>
<body>
<div class="header"></div>
<div class="daohang">
    <table border="0.8px" >
        <tr>
            <td width="120px"><a href="${pageContext.request.contextPath}/query_Information/0">学生信息查询</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/add_information/0">学生信息添加</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/update_delete/1">学生信息修改</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/query_Information/1">教师信息查询</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/add_information/1">教师信息添加</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/update_delete/2">教师信息修改</a></td>

              <form:form action="${pageContext.request.contextPath}/OneQuery/${flag}" method="post" cssClass="" commandName="key">
                  <td width="100px" >
                     <form:input  width="60px" path="id" placeholder="请输入要查询的编号"/>
               </td>
                  <td width="50px"> <input type="submit" value="搜索" width="30px"/></td>
              </form:form>

        </tr>
    </table>
</div>

<c:if test="${flag==2 || flag == -1}">
<div class="middle">

    <table border="3px">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>密码</th>
        </tr>
        <c:forEach items="${teachers}" var="teacher">

        <tr >
            <td width="100px"><%--<c:out value="${teacher.id}"/> 两种方法都行--%>
                ${teacher.id}
            </td>
            <td width="100px">
                <c:out value="${teacher.name}"/>
            </td>
            <td width="100px">
                <c:out value="${teacher.password}"/>
            </td>
            <td  width="50px">
               <a href="${pageContext.request.contextPath}/update_TS/1/${teacher.id}" class="update_delete">更改</a>
            </td>
            <td  width="50px">
                <a href="${pageContext.request.contextPath}/delete_TS/1/${teacher.id}" class="update_delete">删除</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>
</c:if>
<c:if test="${flag== 0 || flag == 1}" >
    <div class="middle">

        <table border="3px">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>密码</th>
                <th>班级</th>
                <th>班级编号</th>
            </tr>
            <c:forEach items="${students}" var="student">
                <tr >
                    <td width="70px"><%--<c:out value="${teacher.id}"/> 两种方法都行--%>
                            ${student.id}
                    </td>
                    <td width="70px">
                        <c:out value="${student.name}"/>
                    </td>
                    <td width="70px">
                        <c:out value="${student.password}"/>
                    </td>
                    <td width="70px">
                        <c:out value="${student.className}"/>
                    </td>
                    <td width="70px">
                        <c:out value="${student.classId}"/>
                    </td>
                    <td width="50px">
                        <a class="update_delete" href="${pageContext.request.contextPath}/update_TS/0/${student.id}">更改</a>
                    </td>
                    <td width="50px">
                        <a href="${pageContext.request.contextPath}/delete_TS/0/${student.id}"  class="update_delete">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</c:if>
<div class="footer"></div>
</body>
</html>
