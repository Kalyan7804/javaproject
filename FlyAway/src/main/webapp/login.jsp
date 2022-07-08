<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<style>
.center {
padding: 70px 0;
	text-align: center;
  margin: auto;
  width: 60%;
  border: 3px solid #73AD21;
 
}
.button {
  background-color: #1abc9c;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

</style>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="center">

	<h1>Welcome to login page</h1>
	
	<form action="ValidateUserServlet" method="post">
			<strong>User Login</strong><br/>
			Username: <input type="text" name="uname"/><br/>
			Password: <input type="password" name="pword"/><br/>
			<input type="submit" class="button" value="Login"/>
			
			<a href="signup.jsp" class="button">Add User</a>
			<a href="changepassword.jsp" class="button">Change Password</a><br/><br/>
			<strong>Admin Login</strong><br/>
			<a href="adminlogin.jsp" class="button">click here for admin</a>
			
			
		</form>
</div>

</body>
</html>