<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProductInto</title>
</head>
<body>
	<div id="global">
		<form action="product_save"  method="post">
			<fieldset>
				<legend>Add a product</legend>
				<label for="name"> ProductName:</label> 
				<input type="text"
					id="name" name="name" value="" tabindex="1" />
                <label for = "description">Description:</label>
                <input type="text"
                     id = "description" name= "description" tabindex= "2"/>
                <label for="price">Price:</label>
                <input type="text" 
                      id= "price" name ="price" tabindex="3"/>
                <div id ="buttons">
                <label for="dummy"></label>
                <input type="reset" id ="reset" tabindex="4"/>
                <input type="submit" type="submit" tabindex="5" value="add Product" />
                </div>
			</fieldset>
		</form>
	</div>
</body>
</html>