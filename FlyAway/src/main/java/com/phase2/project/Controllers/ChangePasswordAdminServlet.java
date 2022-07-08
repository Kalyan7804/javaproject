package com.phase2.project.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phase2.project.dao.AdminDao;
import com.phase2.project.dto.Admin;


public class ChangePasswordAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AdminDao adminDao=null;
    
    public ChangePasswordAdminServlet() {
		adminDao=new AdminDao();
	}
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("auname");
		String pword=request.getParameter("apassword");
		
		adminDao.achangePwd(uname, pword);
		
		response.sendRedirect("./adminlogin.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
