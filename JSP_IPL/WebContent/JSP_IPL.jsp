<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page import="java.util.*" %>
<%@ page import="entity.Team" %>
</head>
<body>
<%
	List<Team> teamList = (List<Team>) request.getAttribute("Team");
	%>
<center>
<div>
		<table>
			<thead>
				<tr>
					<th>Team Id</th>
					<th>Team Name</th>
					<th>Team City</th>
					<th>Team State</th>
				</tr>
			</thead>
			<tbody align="center">
				<%
				for(Team value : teamList) {
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
<form action="UI_serv" method="post">
		<label>ID:</label>
		<input type="number" name="id"><br><br>
		<label>Name:</label>
		<input type="text" name="name"><br><br>
		<label>City:</label>
		<input type="text" name="city"><br><br>
		<label>State:</label>
		<input type="text" name="state"><br><br>
		<input type="submit" value="insertTeam" name="insertTeam"> 
	</form>
</form>
</center>
</body>
</html>