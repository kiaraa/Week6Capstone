<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Update task</h3>
	<form action="update-task?taskid=${task-id }">
		<input type="text" name="name" placeholder="Name"> <input
			type="text" name="description" placeholder="Description"> <input
			type="text" name="dueDate" placeholder="mm/dd/yyyy"> <input
			type="hidden" name="taskListId" value=${listId }> <input
			type="submit" value="Update">
	</form>
</body>
</html>