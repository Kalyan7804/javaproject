<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String name= request.getParameter("uname");
		out.println("hello "+ name);
		session.setAttribute("user", name);
		String username=application.getInitParameter("username");
		out.println("Context param value is "+username);
		Date date= new Date();
		
	%>
	
	<%=
		"Today is"+ date
	%>
</body>
</html>