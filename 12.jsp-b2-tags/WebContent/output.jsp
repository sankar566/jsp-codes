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
   
      <p>The value of 10*10 = <%= 10 * 10 %></p>
      <p>The value of 10>40 = <%= 10>40 %></p>
      
      <%
      for( int i=0;i<10;i++)
      {
    	  out.print("<p> The value of i ="+i+" </p>");
    	  } %>
    	  
      <%!
      int calLength(String string)
      {
    	return string.length();
    	  } %>
      <p>The length of The string is <%= calLength("sankar") %> </p>
  
</body>
</html>