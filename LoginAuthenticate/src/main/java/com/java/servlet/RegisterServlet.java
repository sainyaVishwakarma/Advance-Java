package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.java.beans.MyUser;
import com.java.beans.RegisterUser;
import com.java.service.LoginService;
import com.java.service.LoginServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("uid"));
		String name=request.getParameter("nm");
		String addr=request.getParameter("addr");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String[] skills=request.getParameterValues("skill");
		String gender=request.getParameter("gender");
		String date=request.getParameter("dt");
		String city=request.getParameter("city");
		
		LoginService ls=new LoginServiceImpl();
		LocalDate ldt=LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		RegisterUser r=new RegisterUser(id,name,addr,uname,skills,gender,ldt,city);
		MyUser user=new MyUser(uname,pass,"user");
		ls.addRegisterUser(r,user);
		
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.forward(request, response);
	}
}
