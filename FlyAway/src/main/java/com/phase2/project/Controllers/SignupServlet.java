package com.phase2.project.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phase2.project.dao.UserDao;
import com.phase2.project.dto.User;


public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userdao;
	public SignupServlet() {
		userdao= new UserDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String email=request.getParameter("email");
		String phoneno=request.getParameter("phno");
		String username=request.getParameter("uname");
		String password=request.getParameter("pword");
		
		User user=new User(username,password,fname,lname,email,phoneno);
		
		userdao.addUser(user);
		
		
		response.sendRedirect("./index.jsp");
		//PrintWriter writer=response.getWriter();
		//writer.println("Signup servlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
