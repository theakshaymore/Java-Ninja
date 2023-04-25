<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page import="java.util.*" %>
<%@ page import="entity_pac.Team" %>
<style>table,th,td{border:1px solid;}</style>
</head>
<body>
<%
	ArrayList<Team> myList = (ArrayList<Team>)request.getAttribute("Team");
	%>
<center>
<div class="container">
		<table class="table table-striped">
			<thead align="center" class="table-primary">
				<tr>
					<th scope="col">Team Id</th>
					<th scope="col">Team Name</th>
					<th scope="col">Team City</th>
					<th scope="col">Team State</th>
				</tr>
			</thead>
			<tbody align="center">
				<%
				for (Team value : myList) {
				%>
				<tr>
					<td><%=value.getTeam_id()%></td>
					<td><%=value.getName()%></td>
					<td><%=value.getCity()%></td>
					<td><%=value.getState()%></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
</div>

<form action="insert.html">
<button style="margin:8px;padding:4px;background-color:skyblue;border-radius:4px;">Add Team</button>
</form>
</center>
</body>
</html>