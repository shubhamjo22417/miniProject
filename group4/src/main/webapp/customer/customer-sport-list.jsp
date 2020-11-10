
    <%@page import="com.cybage.model.Sport"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
			
			<th>Sport Name</th>
		</tr>
		<c:forEach var="sport" items="${sport}">
			<tr>
			<!-- user.getUsername(); user.getUserrole() -->
			<td><c:out value="${sport.sName}"></c:out></td>  
			
			
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>