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

  <c:out value="sankar from tamil nadu"></c:out>
  
  <c:set var = "i" value="${10*4}"></c:set>
  <p><c:out value = "${i}" ></c:out></p>
  
   <c:set var = "k" value="${100*8}"></c:set>
  <p>before remove the value k = <c:out value = "${k}" ></c:out></p>
  
  <c:remove var ="k"/>
   <p>After remove the value k = <c:out value = "${k}" ></c:out></p>
   
   <p>url tags----> navigate to different page . if you want to navigate the index page </p>
   
   <c:url value ="/index.html"></c:url> <br>
   
   <a href="<c:url value ="/index.html"></c:url>"> Click Here </a>
</body>
</html>