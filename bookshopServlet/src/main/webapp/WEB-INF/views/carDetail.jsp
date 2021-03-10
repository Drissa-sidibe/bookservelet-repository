<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the Details</h1>
	<div class= "container">
	<h1>Name:${mady.name} model:${mady.model}</h1> 
	 <h2>Price:${mady.price}</h2> 
	<h2>descritpion:${mady.description}</h2>
	
	<div class="picture">
				<img src="${mady.picture}">
			</div>
	</div>
	<h2><a href="/car.do">Return to Car List</a></h2>
	
</body>
</html>