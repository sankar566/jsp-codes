<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1> My name is ${Full_Name}</h1>
  <h1> My name is ${Full_Name eq "ss" }</h1>

 <p>This is EL expressions  ${3+6}</p>
  <p>This is EL expressions  ${3+6-88}</p>
   <p>This is EL expressions  ${3>=4}</p>
   <p>This is EL expressions  ${3<-88}</p>
   <p>This is EL expressions  ${3>7}</p>
   <p>This is EL expressions  ${3 ge 9 ? "Wellcome":"Good bye"}</p>
    <p>This is EL expressions  ${3 le 9 ? "Wellcome":"Good bye"}</p>
 
  
</body>
</html>