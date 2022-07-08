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
	<h1>Payment Pagee</h1>
	 <% String orgn = (String) request.getAttribute("origin"); %>
     <% String dest = (String) request.getAttribute("destination"); %>
     <% String airline = (String) request.getAttribute("airline"); %>
     <% String date = (String) request.getAttribute("date"); %>
     <% String time = (String) request.getAttribute("time"); %>
     <% String topays = (String) request.getAttribute("topays"); %>
     <% String paxnos = (String) request.getAttribute("paxnos"); %>
     
     <form action="./paymentconformation.jsp">
     
     <p>YOUR PAYMENT DETAILS</p>
      <pre>
        Origin:			<%= orgn %>
        Destination: 		<%= dest %>
        No of Passengers: 	<%= paxnos %>
        Airline: 		<%= airline %>
        Date: 			<%= date %>
        Time: 			<%= time %>
        Price(in INR): 		<%= topays %>
        </pre>
        
       <h2>Enter payment details</h2>
       <input list="cards" name="cards">
       <datalist id="cards">
       		<option value="visa">VISA</option>
       		<option value="rupay">RuPay</option>
       </datalist>
       <input type="submit">
       
   		</form>
   		
	

</body>
</html>