package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.java.service.ProductService;
import com.java.service.ProductServiceImpl;
/**
 * Servlet implementation class DeleteProductServlet
 */
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//super.doGet(request, response);
				int pid=Integer.parseInt(request.getParameter("pid"));
				ProductService ps=new ProductServiceImpl();
				int n=ps.deleteById(pid);
				System.out.println(n);
				RequestDispatcher rd=request.getRequestDispatcher("product");
				rd.forward(request, response);
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}
	

}
