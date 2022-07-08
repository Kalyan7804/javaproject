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

.left {
  float: center;
  width: 300px;
  border: 3px solid #73AD21;
  padding: 10px;
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


td {
  text-align: left;
}

.flex-container {
  display: flex;
  justify-content: center;
 
}
</style>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="center">
	<h1>Flight Search page</h1>
	 <form action="FlightSearchServlet" method="post">
	 <div class="flex-container">
	<table>
                        <thead>
                           
                        </thead>
                        <tbody>
                            <tr>
                                <td><label for="date">Departure Date:</label></td>
                                <td><input type="date" id="date" name="date" required></td>
                            </tr>
                            <tr>
                                <td><label for="origin">Origin:</label></td>
                                <td><input type="text" id="origin" name="origin" required></td>
                            </tr>
                            <tr>
                                <td><label for="destination">Destination:</label></td>
                                <td><input type="text" id="destination" name="destination" required></td>
                            </tr>
                            <tr>
                                <td><label for="pax">Number of travelers:</label></td>
                                <td><input type="number" id="pax" name="pax"  min="1" max="9"></td>
                            </tr>
                            <tr>
                                <td><button type="submit" class="button">Search</button></td>
                                <td><button type="reset" class="button">Reset</button></td>
                            </tr>
                        </tbody>
                    </table>
      </div>
                 </form>
</div>                 
                 
</body>
</html>