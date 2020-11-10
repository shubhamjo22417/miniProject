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
	Updating user
	<form method="post"
		action="<%=request.getContextPath()%>/AdminController/updateuser">
		Username: <input type="text" name="uName" value="${user.uName}" readonly="readonly"> <br>
		Password: <input type="password" name="uPassword" value=""> <br>
		Role: <input type="text" name="uRole" value="${user.uRole}"> <br> <input
			type="submit" value="Update User">
	</form>
</body>
</html>