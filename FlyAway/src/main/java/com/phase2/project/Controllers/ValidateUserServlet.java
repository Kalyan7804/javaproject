package com.phase2.project.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phase2.project.dao.UserDao;
import com.phase2.project.dto.User;


public class ValidateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
	public ValidateUserServlet() {
		userDao=new UserDao();
	}
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String password=request.getParameter("pword");
		
		User user=null;
		user=userDao.getUser(username, password);
		
		if(user!=null) {
			response.sendRedirect("./FlightSearch.jsp");
		}
		else {
			response.sendRedirect("./index.jsp");
		}
		PrintWriter writer=response.getWriter();
		writer.print(username+" "+password);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
