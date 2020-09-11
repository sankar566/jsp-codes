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
<h2>Employee directory form </h2>
<hr/>
<div class="row">
   <div class = "col-md-4">
       <form action = "${pageContext.request.contextPath}/EmployeeController" method="POST">
         <div class="form-group">
          <input type="text" name = "name" value="${employee.name}"placeholder = "enter your name" class="from-control"/> </br>
         </div>
         <div class="form-group">
         <input type="date" name="dob" value="${employee.dob}" placeholder ="your date of birth" class="from-control"/> </br>
         </div>
         <div class="form-group">
          <input type="text" name="department" value="${employee.department}" placeholder ="enter your department" class="from-control"/> </br>
         </div>
        
         <input type="hidden" name="id" value="${employee.id}"/>
         <button class = "btn btn-primary">Save Employee</button>
      </form>
   </div>
</div>


</div>

</body>
</html>