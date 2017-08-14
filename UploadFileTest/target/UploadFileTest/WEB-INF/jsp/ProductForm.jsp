<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-8-14
  Time: 上午11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
     <div>
         <form:form commandName="product" method="post" enctype="multipart/form-data" action="product_save">
         <p> <label for="name">
                  Product:
          </label> <form:input id = "name" path="name"/></p>
             <p>
             <label for="description">Description:</label>
             <form:input path="description" id="description"></form:input>
             </p>
             <p>
             <label for="price" >Price:</label>


             <form:input path="price" id="price"/></p>
             <p>
             <label for="image">Image:</label>

            <input type="file" id ="image" name="image[0]"/>
             </p>
             <p id="button">
                 <input type="submit" id="submit" tabindex="4"/>
                 <input type="reset" id="reset" tabindex="5" />
             </p>
         </form:form>
     </div>
</body>
</html>
