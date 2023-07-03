package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.java.beans.MyUser;
import com.java.beans.Product;
import com.java.service.ProductService;
import com.java.service.ProductServiceImpl;

@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		MyUser u=(MyUser)session.getAttribute("user");
		if(u!=null && u.getRole().equals("admin")) {
				int pid=Integer.parseInt(request.getParameter("pid"));
				String pdesc=request.getParameter("pdes");
				
				Product p=new Product(pid,pdesc);
				ProductService ps=new ProductServiceImpl();
				int n=ps.updateProduct(p);
				RequestDispatcher rd=request.getRequestDispatcher("product");
				rd.forward(request, response);
		}else {
			//if user is invalid and reached to this page without login or login as user
			//then redirect to Login page
			
			System.out.println("not admin");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}
	}

}
