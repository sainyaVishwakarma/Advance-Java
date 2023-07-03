package com.java.servlet;
import com.java.beans.MyUser;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.java.service.ProductService;
import com.java.service.ProductServiceImpl;
import com.java.beans.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductServlet extends HttpServlet{
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	HttpSession session=request.getSession();
	MyUser u=(MyUser)session.getAttribute("user");
	if(u!=null && u.getRole().equals("admin")) {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	ProductService ps=new ProductServiceImpl();
	List<Product> plist=ps.getAllProducts();
	out.println("<table border='2' ><tr><th>Product id</th><th>Product Description</th><th>Action</th></tr>");
	for(Product p:plist) {
		out.println("<tr><td>"+p.getProdid()+"</td><td>"+p.getDescrip()+"</td>");
		out.println("<td><a href='delete?pid="+p.getProdid()+"'>delete</a>/<a href='edit?pid="+p.getProdid()+"'>edit</a><td></tr>");
	}
	out.println("</table>");
	out.println("<a href='addProduct.html'>Add new product</a>");
	}
	else {
		System.out.println("not admin");
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.forward(request, response);
	}
}
public void doget(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	doPost(request,response);
}
}

