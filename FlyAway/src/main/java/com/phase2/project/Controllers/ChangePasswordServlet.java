package com.phase2.project.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phase2.project.dao.UserDao;


public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userdao;
	
	public ChangePasswordServlet() {
		userdao=new UserDao();
	}
    
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter writer=response.getWriter();
//		writer.print("Change password servlet");
		String uname=request.getParameter("uname");
		String pword=request.getParameter("password");
		
		userdao.changePwd(uname, pword);
		
		response.sendRedirect("./login.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
