package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.java.service.ProductService;
import com.java.service.ProductServiceImpl;
import com.java.beans.Product;


public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("test/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProductService ps=new ProductServiceImpl();
		Product p=ps.getById(pid);
		out.println("<form action='/LoginAuthenticate/update' method='post'>");
		out.println("Product id : <input type='text' name='pid'  value='"+p.getProdid()+"'><br>");
		out.println("Product description: <input type='text' name='pdes'  value='"+p.getDescrip()+"'><br>");
		 out.println("</form>");
	}

}
