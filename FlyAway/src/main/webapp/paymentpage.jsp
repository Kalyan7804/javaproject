<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.phase2.project.dto.*" %>
<%@ page import="com.phase2.project.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%String flightid  = (String)request.getAttribute("flightid"); %>
	<%int flightid_1=Integer.parseInt(flightid); %>
	<%out.println(flightid); %>
	

</body>
</html>