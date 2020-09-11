<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Directory</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.21/datatables.min.css"/>
 


</head>
<body>
	
	<div class = "container">
	    <h1>Employee Directory</h1>
	     <p>${message}</p>
		<button class = "btn btn-primary" onclick="window.location.href = 'views/employee-add.jsp'">Add Employee</button>
		
		<hr/>
		
		<table class = "table table-striped table-bordered" id="datatable">
			<thead>
			  <tr class = "thead-dark">
				<th>Name</th>
				<th>Department</th>
				<th>Date of birth</th>
				<th>Actions</th>
				
			  </tr>
			</thead>
			<tbody>
			  <c:forEach items="${list}" var="employee">
				<tr>
					<td>${employee.name}</td>
					<td>${employee.department}</td>
					<td>${employee.dob}</td>
					<td>
					<a href = "${pageContext.request.contextPath}/EmployeeController?action=EDIT&id=${employee.id}">Edit</a> 
					|
					<a href = "${pageContext.request.contextPath}/EmployeeController?action=DELETE&id=${employee.id}">Delete</a>
                    </td>
				</tr>
				
			</c:forEach>
			</tbody>
			
		</table>
		
	</div>
      
<script src = "https://unpkg.com/jquery@3.3.1/dist/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.21/datatables.min.js"></script>
<script>

  $(document).ready(function() {
	    $('#datatable').DataTable();
	} );
</script>

</body>
</html>
