<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G3Fme2BM4boCE9tHx9zHvcxaQoAkksPQa/8oyn1Dzqv7gdcXChereUsXGx6LtbqA"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="UTF-8">
<title>My Task Lists</title>
</head>
<body>
	<div id="container">
		<h1>Your Lists</h1>
		<c:forEach var="list" items="${user.taskLists }">
		<a href="show-list?toShow=${list.id }">${list.listName }</a>
<br>
		</c:forEach>

	</div>
</body>
</html>