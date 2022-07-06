<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to login page</h1>

<form action="ValidateUserServlet" method="post">
		Username: <input type="text" name="uname"/><br/>
		Password: <input type="password" name="pword"/><br/>
		<input type="submit" value="Login"/>
		<br/>
		<a href="signup.jsp">Add User</a><br/>
		<a href="changepassword.jsp">Change Password</a><br/>
		
	</form>


</body>
</html>