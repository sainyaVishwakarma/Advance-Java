package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.java.beans.MyUser;
import com.java.beans.Product;
import com.java.service.ProductService;
import com.java.service.ProductServiceImpl;
public class AddProductServlet extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	HttpSession session =request.getSession();
	MyUser u=(MyUser)session.getAttribute("user");
	if(u!=null && u.getRole().equals("admin")) {
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pdes=request.getParameter("pdes");
		Product p=new Product(pid,pdes);
		ProductService ps=new ProductServiceImpl();
		int n=ps.addProduct(p);
		RequestDispatcher rd=request.getRequestDispatcher("product");
		rd.forward(request, response);
	}else {
		System.out.println("not admin");
		RequestDispatcher rd1=request.getRequestDispatcher("login.html");
		rd1.forward(request, response);
	}
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		doGet(req,resp);
	}
}
