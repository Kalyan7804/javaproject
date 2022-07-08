<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.phase2.project.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Showing all flights</h1>
	  <% ArrayList<Flights> allflights = (ArrayList<Flights>) request.getAttribute("allflights"); %>
	  
	  	<table>
    			<thead>
    			<tr>
    				<th>ORIGIN</th>
    				<th>DESTINATION</th>
    				<th>AIRLINE</th>
    				<th>DATE</th>
    				<th>TIME</th>
    				<th>PRICE</th>
    				
    				
    			</tr>
    		</thead>
    		<tbody>
    			<%
    				
    				for(Flights f:allflights){
    					out.print("<td>" + f.getOrigin() + "</td>");
    					out.print("<td>" + f.getDestination() + "</td>");
    					out.print("<td>" + f.getAirline() + "</td>");
    					out.print("<td>" + f.getDate() + "</td>");
    					out.print("<td>" + f.getTime() + "</td>");
    					out.print("<td>" + f.getPrice() + "</td></tr>");
    					//session.setAttribute("flag", f.getId());
    					//out.print("<td><input type='radio' name='selected' value='"+f.getId()+paxno+"' required/></td></tr>");
    				}
    			%>
    		</tbody>
    		</table>
	  
</body>
</html>