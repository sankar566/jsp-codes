<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Directory</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">


</head>
<body>
	
	<div class = "container">
	    <h1>Employee Directory</h1> <p>${m}</p>
		<button class = "btn btn-primary" onclick="window.location.href = 'views/employee-add.jsp'">Add Employee</button>
		
		<hr/>
		
		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Name</th>
				<th>Department</th>
				<th>Date of birth</th>
				
			</tr>

			
			<c:forEach items="${list}" var="employee">
			
				<tr>
					<td>${employee.name}</td>
					<td>${employee.department}</td>
					<td>${employee.dob}</td>
					
				</tr>
				
			</c:forEach>
			
		</table>
		
	</div>


</body>
</html>
