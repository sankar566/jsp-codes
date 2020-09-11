<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Insert title here</title>
</head>
<body>

 <c:out value = "${fn:toLowerCase('SANKAR')}"></c:out>
 <c:out value = "${fn:toUpperCase('sankar')}"></c:out>
 
 <h1>${text}</h1>
 
  <c:set var="funtext" value="${text}">
  
  </c:set>
  
 <c:out value = "${fn:toUpperCase('${funtext}')}"></c:out> 
   <a href="<c:url value ="/index.html"></c:url>"> Click Here </a>
</body>
</html>