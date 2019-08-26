<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G3Fme2BM4boCE9tHx9zHvcxaQoAkksPQa/8oyn1Dzqv7gdcXChereUsXGx6LtbqA"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style.css">
<title>List</title>
</head>
<body>
	<h1>Tasks in ${list.listName }</h1>

	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Description</th>
				<th scope="col">Due Date</th>
				<th scope="col">Mark Complete</th>
				<th scope="col">Complete?</th>
				<th scope="col">Update</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="task" items="${list.tasks }">
				<tr class="table-primary">
					<%-- <th scope="row">${task.name }</th> --%>
					<td>${task.id }</td>
					<td>${task.name }</td>
					<td>${task.description }</td>
					<td>${task.dueDate }</td>
					<td><a href="completeTask?taskid=${task.id }">Complete</a></td>
					<td>${task.completed }</td>
					<td><a href="goToUpdateTask?task-id=${task.id }">Update</a></td>
					<td><a href="deleteTask?taskid=${task.id }">Delete Task</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<h3>Add new task</h3>
	<form action="add-task">
		<input type="text" name="name" placeholder="Name"> <input
			type="text" name="description" placeholder="Description"> <input
			type="text" name="dueDate" placeholder="mm/dd/yyyy"> <input
			type="hidden" name="taskListId" value=${list.id }> <input
			type="submit" value="Add">
	</form>
</body>
</html>