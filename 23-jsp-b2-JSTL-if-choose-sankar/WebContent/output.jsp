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

  <c:if test ="${900 > 500}" >
        <p> condition correct and execute inside of this block</p>
      
  </c:if>
  <c:set var="mark" value="85">
  </c:set>
  <c:choose>
       <c:when test ="${mark>90}">  
            <p> mark higher than 90</p>
       </c:when> 
       <c:otherwise>
           <p>mark less than 90</p>
       </c:otherwise>
  </c:choose> 
  
  <h1>${mar}</h1>
 
  <c:set var="m" value="${mar}">
  </c:set>
  <c:choose>
       <c:when test ="${m>40}">  
            <p> mark higher than 40</p>
       </c:when> 
       <c:otherwise>
           <p>mark less than 40</p>
       </c:otherwise>
  </c:choose> 

   
   <a href="<c:url value ="/index.html"></c:url>"> Click Here </a>
</body>
</html>