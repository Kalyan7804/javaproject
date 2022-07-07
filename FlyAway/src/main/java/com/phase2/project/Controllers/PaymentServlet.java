package com.phase2.project.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phase2.project.dao.FlightDao;
import com.phase2.project.dto.Flights;


public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private FlightDao flightDao;
	
	public PaymentServlet() {
		flightDao= new FlightDao();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		
		String flightid=request.getParameter("selected");
	
		int flightidi=Integer.parseInt(flightid);
		writer.println(flightidi);
		//request.setAttribute("flightid",flightid);
		Flights flight=flightDao.getFlightById(flightidi);
		writer.println(flight.getId());
		writer.println(flight.getOrigin());
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("./paymentpage.jsp");
		//dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
