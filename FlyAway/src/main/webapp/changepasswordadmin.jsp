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

	<form action="ChangePasswordAdminServlet" method="post">
		
		
		 <div class="flex-container">
				<table>
					<tr>
					</tr>
					<tr>
							<td>Admin User Name</td>
							<td><input type="text" name="auname"/></td>				
					</tr>
					<tr>
						<td>New Password</td>
						<td><input type="text" name="apassword"/></td>				
					</tr>
					
					
				</table>
				
				</div>
		
		<div class="flex-container1"><input type="submit" value="submit"/><br/></div>
		
	</form>

</body>
</html>