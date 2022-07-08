<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%@ page import="com.phase2.project.dto.*" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<style>
table, th, td {
  border: 1px solid;
}
td {
  text-align: center;
}

th, td {
  padding: 15px;
  text-align: left;
}

tr:hover {background-color: coral;}

th {
  background-color: #1abc9c;
  color: white;
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
	<h1>Available flights are listed below</h1>
	<%
	ArrayList<Flights> flights = (ArrayList<Flights>) request.getAttribute("flights");
	%>
    <% String origin = (String) request.getAttribute("origin"); %>
    <% String dtsn = (String) request.getAttribute("destination"); %>
    <% int paxno = Integer.parseInt((String) request.getAttribute("paxno")); %>
    <!-- 
    <%out.println(origin); %>
    <%out.println(dtsn); %>
    <%out.println(paxno); %>
    <%out.println(flights); %>     -->
    
    <main>
    	<form action="PaymentServlet" method="post">
    		<table>
    			<thead>
    			<tr>
    				<th>ORIGIN</th>
    				<th>DESTINATION</th>
    				<th>AIRLINE</th>
    				<th>DATE</th>
    				<th>TIME</th>
    				<th>PRICE</th>
    				<th>NO OF PASSENGERS</th>
    				<th>SELECT</th>
    			</tr>
    		</thead>
    		<tbody>
    			<%
    				
    				for(Flights f:flights){
    					out.print("<td>" + origin + "</td>");
    					out.print("<td>" + dtsn + "</td>");
    					out.print("<td>" + f.getAirline() + "</td>");
    					out.print("<td>" + f.getDate() + "</td>");
    					out.print("<td>" + f.getTime() + "</td>");
    					out.print("<td>" + (f.getPrice()*paxno) + "</td>");
    					out.print("<td>" + paxno + "</td>");
    					//session.setAttribute("flag", f.getId());
    					out.print("<td><input type='radio' name='selected' value='"+f.getId()+paxno+"' required/></td></tr>");
    				}
    			%>
    		</tbody>
    		</table>
    		<button type="submit" class="button">Go to Payment</button>
    	</form>
    </main>
    
    
	
	
</body>
</html>