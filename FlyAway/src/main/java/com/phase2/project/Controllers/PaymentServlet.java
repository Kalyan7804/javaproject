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
		
		String data=request.getParameter("selected");
		//writer.print(data);
		int flightidi=Integer.parseInt(data);
		int paxno=flightidi%10;
		String paxnos=String.valueOf(paxno);
		int flightid=flightidi/10;
		//writer.println(paxno);
		//writer.println(flightid);
		
//		writer.println(flightidi);
		Flights flight=flightDao.getFlightById(flightid);
//		writer.println(flight.getId());
//		writer.println(flight.getOrigin());
		
		String origin=flight.getOrigin();
		String destination=flight.getDestination();
		String date=flight.getDate();
		String time=flight.getTime();
		Double topay=flight.getPrice()*paxno;
		String topays=String.valueOf(topay);
		String airline=flight.getAirline();
		
	//	request.setAttribute("flightid",flightid);
		request.setAttribute("origin",origin);
		request.setAttribute("destination",destination);
		request.setAttribute("airline", airline);
		request.setAttribute("paxnos",paxnos);
		request.setAttribute("date",date);
		request.setAttribute("time",time);
		request.setAttribute("topays",topays);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./paymentpage.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
