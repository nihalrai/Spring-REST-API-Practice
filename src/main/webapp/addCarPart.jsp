<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addCarPart.req" method="post">
		Part No:   <input type="text" name="partno" /> <br />
		Name:      <input type="text" name="name" /> <br /> 
		Car Model: <input type="text" name="carModel" /> <br /> 
		Price:     <input type="text" name="price" /> <br /> 
		Quantity:   <input type="text" name="quantity" /> <br />
		           <button type="submit">Add</button>  
 
	</form>
</body>
</html>