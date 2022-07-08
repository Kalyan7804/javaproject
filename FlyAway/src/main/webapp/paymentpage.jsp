<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.phase2.project.dto.*"%>
<%@ page import="com.phase2.project.dao.*"%>
<%@ include file="header.jsp"%>
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
.body {
	font-family: Arial;
	margin: 0;
}

td {
  text-align: left;
}
</style>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="center">
		<h1>Payment Page</h1>
		<%
		String orgn = (String) request.getAttribute("origin");
		%>
		<%
		String dest = (String) request.getAttribute("destination");
		%>
		<%
		String airline = (String) request.getAttribute("airline");
		%>
		<%
		String date = (String) request.getAttribute("date");
		%>
		<%
		String time = (String) request.getAttribute("time");
		%>
		<%
		String topays = (String) request.getAttribute("topays");
		%>
		<%
		String paxnos = (String) request.getAttribute("paxnos");
		%>

		<form action="./paymentconformation.jsp">

			<p>
				<strong>YOUR PAYMENT DETAILS</strong>
			</p>
	        <div class="flex-container">
				<table>
					<tr>
					</tr>
					<tr>
							<td>Origin:</td>
							<td><%=orgn%></td>				
					</tr>
					<tr>
						<td>Destination:</td>
						<td><%=dest%></td>				
					</tr>
					<tr>
						<td>No of Passengers:</td>
						<td><%=paxnos%></td>
					</tr>
					<tr>
						<td>Airline:</td>
						<td><%=airline%></td>
					</tr>
					<tr>
						<td>Date</td>
						<td><%=date%></td>
					</tr>
					<tr>
						<td>Time</td>
						<td><%=time%></td>
					</tr>
					<tr>
						<td>Price(in INR):</td>
						<td><%=topays%></td>
					</tr>
				</table>
				</div>

			<h2>Enter payment details</h2>
			<input list="cards" name="cards" required>
			<datalist id="cards">
				<option value="visa">VISA</option>
				<option value="rupay">RuPay</option>
			</datalist>
			<input type="submit">
			<button type="reset"><a id="cancel" href="./index.jsp">Cancel</a></button>

		</form>
	</div>


</body>
</html>