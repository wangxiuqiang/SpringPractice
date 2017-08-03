
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>ProductForm</title>
</head>
<body>
    <div>
        <form:form commandName="product" action="product_save" method="post">
        <fieldset>
            <legend>Add a product</legend>
           <p><form:errors path="name"/>
               <br>
            <label for ="name"> Name:</label>
            <form:input path="name" id="name"/>
           </p>
            <p>

                <br>
            <label for="description" >Description:</label>
            <form:input path="description" id="description" />
            </p>
            <p>

                <br>
            <label for="price" >price:</label>
            <form:input path="price" id="price"/>
            </p>
            <p>
                <form:errors path="productionDate"/>
                <br>
            <label for="productionDate" >ProdecetionDate:</label>
            <form:input path="productionDate" id="productionDate"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4" />
                <input id="submit" type="submit" tabindex="5" value ="Add Book" />
            </p>
        </fieldset>
        </form:form>
    </div>
</body>
</html>
