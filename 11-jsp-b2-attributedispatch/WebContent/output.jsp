<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h5> dispatched attributes to jsp output file </h5>
 <p> <%= request.getAttribute("name") %></p>
 <p> <%= request.getAttribute("dob") %></p>
 
 <h3> <% String fullName = request.getAttribute("name").toString();
         out.println(fullName);
         
         %></h3>
  
</body>
</html>