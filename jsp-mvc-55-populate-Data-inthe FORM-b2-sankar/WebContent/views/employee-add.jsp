<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">

</head>
<body>
<div class="container">

 <form action = "${pageContext.request.contextPath}/EmployeeController" method="POST">
 
  Enter name: <input type="text" name = "name" value="${employee.name}"/> </br>
  Enter date of birth:<input type="date" name="dob" value="${employee.dob}"/> </br>
  Enter department:<input type="text" name="department" value="${employee.department}"/> </br>
  <button class = "btn btn-primary">Save Employee</button>
 </form>

</div>

</body>
</html>