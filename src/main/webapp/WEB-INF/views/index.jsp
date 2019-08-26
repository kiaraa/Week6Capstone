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
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Task List - Login</title>
</head>
<body>
	<div id="container">
		<form name="signup-form" action="sign-up">
			<div class="form-group">
				<label for="staticEmail">Email</label> <input type="text"
					class="form-control-plaintext" id="staticEmail"
					value="email@example.com" pattern="[0-z]+@[0-z]{1,10}\.com"
					required name="email"><br> <label
					for="exampleInputPassword1">Password</label> <input type="password"
					class="form-control" id="exampleInputPassword1"
					placeholder="Password" required name="password"><br>
				<button type="submit" class="btn btn-primary btn-lg btn-block">Sign
					up!</button>
			</div>
		</form>
		<form name="signin-form" action="sign-in">
			<div class="form-group">
				<label for="returningEmail">Email</label> <input type="text"
					class="form-control-plaintext" id="returningEmail"
					value="email@example.com" pattern="[0-z]+@[0-z]{1,10}\.com"
					required name="old-email"><br> <label
					for="exampleInputPassword1">Password</label> <input type="password"
					class="form-control" id="exampleInputPassword1"
					placeholder="Password" required name="old-password"><br>
				<button type="submit" class="btn btn-primary btn-lg btn-block">Sign
					in!</button>
			</div>
		</form>
	</div>
</body>
</html>