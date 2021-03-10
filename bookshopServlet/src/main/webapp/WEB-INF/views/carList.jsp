<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Autogare</title>
</head>
<body>
	<div class="container">
	<table>
	<thead>
		<tr>
			<th>name</th>
			<th>model</th>
			<th>price</th>
			<th>Delete</th>
		</tr>
	</thead>
	<tbody>
	
	<c:forEach items ="${sekou}" var="done"> 
		<tr>
			<td>${done.name}</td>
			
			<td>${done.model}</td>
			<td> <a href="/detail.do?id=${done.id}">See More</a></td>
			<td>${done.price}</td>
			<td> <a href="/create.do"/>Create a Car</a></td>
		</tr>
			<div class="picture">
				<img src="${done.picture}">
			</div>
			 <a href="/delete.do?id=${done.id}">Delete</a>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>



