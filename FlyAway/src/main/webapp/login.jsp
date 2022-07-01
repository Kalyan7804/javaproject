<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<hi>Welcome to login page</hi>

<form action="ControllerServlet" method="post">
		Username: <input type="text" name="uname"/><br/>
		Password: <input type="password" name="pword"/><br/>
		<input type="submit" value="Login"/>
		<br/>
		<a href="signup.jsp">Add User</a><br/>
	</form>


</body>
</html>