package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConvertorServlet extends HttpServlet {
	
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	String dollar=request.getParameter("dollar");
	String inr=request.getParameter("inr");
	if(dollar.equals("")) {
		out.println("INR: "+inr);
	}else {
		out.println("dollar:" +dollar);
	}
}
}
