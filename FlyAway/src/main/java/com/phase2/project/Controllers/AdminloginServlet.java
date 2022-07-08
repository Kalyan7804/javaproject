package com.phase2.project.Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phase2.project.dao.AdminDao;
import com.phase2.project.dao.UserDao;
import com.phase2.project.dao.FlightDao;
import com.phase2.project.dto.Admin;
import com.phase2.project.dto.Flights;


public class AdminloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdminDao adminDao;
	private FlightDao flightDao;
	
	public AdminloginServlet() {
		adminDao=new AdminDao();
		flightDao=new FlightDao();
		
	}		
	
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("auname");
		String password=request.getParameter("apword");
		PrintWriter writer=response.getWriter();
		//writer.println(username);
		//writer.println(password);
		
		Admin admin=null;
		admin=adminDao.getUser(username, password);
		
		ArrayList<Flights> allflights = null;
		allflights=flightDao.getAllFlights();
		
		request.setAttribute("allflights", allflights);
		
		if(admin!=null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("./ShowAllFlights.jsp");
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect("./index.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
