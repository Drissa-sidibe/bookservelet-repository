<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
	<h1>Please Login the Form</h1>
	${Error}
</head>
<body>
	<form action="login.do" method="POST">
		Username:<input type ="text" name= "username">
		Password:<input type = "text" name = "password">
		<input type ="submit">
		
	</form>
</body>
</html>