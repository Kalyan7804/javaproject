<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<style>
.flex-container {
  display: flex;
  justify-content: center;
 
}
.flex-container1 {
  display: flex;
  justify-content: center;
  background-color: #1abc9c;
  border: none;
  color: white;
  padding: 15px 32px;
 
  text-decoration: none;
  
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
	<form action="SignupServlet" method="post">
		
		
		
		 <div class="flex-container">
				<table>
					<tr>
					</tr>
					<tr>
							<td>First Name:</td>
							<td><input type="text" name="firstName"/></td>				
					</tr>
					<tr>
						<td>Last Name</td>
						<td><input type="text" name="lastName"/></td>				
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="email" name="email"/></td>
					</tr>
					<tr>
						<td>Phone Number</td>
						<td><input type="number" name="phno"/></td>
					</tr>
					<tr>
						<td>User Name</td>
						<td><input type="text" name="uname"/><br/></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="pword"/></td>
					</tr>
					
				</table>
				
				</div>
		
	<div class="flex-container1">	<button type="submit">Proceed</button> </div>
	</form>

</body>
</html>