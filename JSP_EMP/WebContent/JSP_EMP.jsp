<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="entity.Employee"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>day25_GA</title>
</head>

<body>
	<center>
		<h2>Welcome to HrHome Page</h2>
		<form action="EmpServlet" method="post">
			
			<div class="input-group mb-3">
  				<input type="text" class="form-control form-control-sm" name="searchName" placeholder="Enter Name">
  				<div class="input-group-append">
    				<input class="btn btn-primary" type="submit" value="Search" name="Search">
  				</div>
			</div>

			<div class="container mt-5">
				<table class="table table-bordered table-hover mt-3">
					<thead class="table-secondary">
						<tr>
							<th>EmpId</th>
							<th>Name</th>
							<th>Address</th>
							<th>DeptId</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="emp" items="${EMP}">
							<tr>
								<td><input type="radio" name="emp_id" value="${emp.eId}">${emp.eId}</td>
								<td>${emp.eName}</td>
								<td>${emp.eAdd}</td>
								<td>${emp.deptId}</td>
								<td><a href="./editEmp.html">edit</a>&nbsp &nbsp<a href="#">delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</form>
	</center>
</body>

</html>