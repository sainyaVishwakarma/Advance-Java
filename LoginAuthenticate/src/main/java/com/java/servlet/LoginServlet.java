package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import com.java.service.LoginService;
import com.java.beans.MyUser;
import com.java.service.LoginServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException  {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	LoginService ls=new LoginServiceImpl();
	MyUser u=ls.validateUser(uname,pass); 
	if(u==null) {
		out.println("<h3>Invalid Credentials</h3>");
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.include(request, response);
	}else {
		//out.println("<h3>Successful Login</h3>");
		HttpSession session=request.getSession();
		if(session.isNew()) {
			session.setAttribute("user", u);
		}
		RequestDispatcher rd1=request.getRequestDispatcher("product");
		rd1.forward(request, response);
	}
}
}
