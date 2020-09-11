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
 <h3>My name is ${studentobject.name } and his age is ${studentobject.age }</h3>
 
  <h5>My name is ${studentobject.name } and his age is ${studentobject.age } from ${studentobject.location }</h5>
  <c:out value="sankar from tamil nadu"></c:out>
</body>
</html>