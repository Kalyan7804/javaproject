package com.phase2.project.Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phase2.project.dao.FlightDao;
import com.phase2.project.dto.Flight;


public class FlightSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FlightDao flightdao;
       
    
    public FlightSearchServlet() {
       flightdao=new FlightDao();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter writer=response.getWriter();
//		writer.println("Flight search servlet");
		
		String orgn=request.getParameter("origin");
		String dtsn=request.getParameter("destination");
		String dat=request.getParameter("date");
		String paxno=request.getParameter("pax");
		ArrayList<Flight> flights = null;
		
		
		flights=flightdao.getFlights(orgn,dtsn , dat);
		
		
		
		request.setAttribute("flights", flights);
		request.setAttribute("origin", orgn);
		request.setAttribute("destination", dtsn);
		request.setAttribute("paxno", paxno);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./availableFlights.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
