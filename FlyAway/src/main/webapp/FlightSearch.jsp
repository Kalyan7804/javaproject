<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Flight Serch page</h1>
	 <form action="FlightSearchServlet" method="post">
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
                                <td><button type="submit">Search</button></td>
                                <td><button type="reset">Reset</button></td>
                            </tr>
                        </tbody>
                    </table>
                 </form>
</body>
</html>