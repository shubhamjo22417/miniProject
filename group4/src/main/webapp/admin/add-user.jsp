<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Adding new user
	<form method="post" action="<%=request.getContextPath()%>/AdminController/adduser">
		Username: <input type="text" name="uName"> <br>
		Password: <input type="password" name="uPassword"> <br>
		Role: <input type="text" name="uRole"> <br>
		Email <input type="text" name="uEmail"> <br>
		Contact Number:<input type="text" name="uNumber"> <br>
		  
		 <input type="submit" value="Add User">
	</form>
</body>
</html>