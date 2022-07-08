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

.flex-container {
  display: flex;
  justify-content: center;
 
}
td {
  text-align: left;
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
	<form action="AdminloginServlet" method="post">
		
		
		  <div class="flex-container">
				<table>
					<tr>
					</tr>
					<tr>
							<td>AdminUsername:</td>
							<td><input type="text" name="auname"/></td>				
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" name="apword"/></td>				
					</tr>
					
				</table>
				</div>
		<input type="submit" class="button" value="Login"/>
		<a href="changepasswordadmin.jsp" class="button">Change Password</a><br/>
	</form>
</div>
</body>
</html>