<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SignupServlet" method="post">
		First Name : <input type="text" name="firstName"/><br/>
		Last Name  : <input type="text" name="lastName"/><br/>
		Email		:<input type="email" name="email"/><br/>
		Phone Number  : <input type="number" name="phno"/><br/>	
		
		User Name  : <input type="text" name="uname"/><br/>
		Password   : <input type="password" name="pword"/><br/>
		<button type="submit">Proceed</button>
	</form>

</body>
</html>