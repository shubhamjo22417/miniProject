<%@page import="com.cybage.model.Users"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- logic for rendering list...  -->
	${deletemsg}
	<a href="<%=request.getContextPath()%>/admin/add-user.jsp">add users</a>
	<table border="1">
		<tr>
			<th>Username</th>
			<th>Userrole</th>
		</tr>
		<c:forEach var="user" items="${user}">
			<tr>
			<!-- user.getUsername(); user.getUserrole() -->
			<td><c:out value="${user.uName}"></c:out></td>  
			<td><c:out value="${user.uRole}"></c:out></td>
			<td>
			<a href="<%=request.getContextPath()%>/AdminController/deleteuser?uName=${user.uName}">delete</a>
			</td>
			<td>
			<a href="<%=request.getContextPath()%>/AdminController/edituser?uName=${user.uName}">update</a>
			</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>