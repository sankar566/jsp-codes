<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Insert title here</title>
</head>
<body>

  <c:forEach items ="${countryArray}" var="countryvariable">
        <p> country name = ${countryvariable}</p>
  </c:forEach>
  
   <c:url value ="/index.html"></c:url> <br>
   
   <a href="<c:url value ="/index.html"></c:url>"> Click Here </a>
</body>
</html>