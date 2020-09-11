<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Directory</title>


</head>
<body>
	
	<div >
		
		<h1>Employee Directory</h1>
		<hr/>
		
		<table >
			
			<tr >
				<th>Name</th>
				<th>Department</th>
				<th>Date of birth</th>
				<th>Actions</th>
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
