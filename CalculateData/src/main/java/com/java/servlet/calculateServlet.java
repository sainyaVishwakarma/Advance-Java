package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculateServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		String button=request.getParameter("btn");
		switch(button) {
		case "add":
			out.println("<h3>"+"Addition: "+(n1+n2)+"</h3>");
			break;
		case "sub":
			out.println("<h3>"+"Subtraction: "+(n1-n2)+"</h3>");
			break;
		case "mul":
			out.println("<h3>"+"Multiplication: "+(n1*n2)+"</h3>");
			break;
		case "div":
			out.println("<h3>"+"Division: "+(n1/n2)+"</h3>");
			break;
		}
	}
}
