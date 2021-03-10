<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Create a Car</h1>
	<form action="create.do" method="Post">
	name:<input type="text"name="name">
	model:<input type = "text" name="model">
	description: <input type ="description">
	picture:<input type ="text" name="picture">
	price<input type="text" name = "price">
	<input type ="submit" value="create">
	</form>
</body>
</html>