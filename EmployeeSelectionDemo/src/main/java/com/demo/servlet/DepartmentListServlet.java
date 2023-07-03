package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import com.demo.beans.Department;
import com.demo.service.DepartmentServiceImpl;
import com.demo.service.DepartmentService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/departments")
public class DepartmentListServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		DepartmentService ds=new DepartmentServiceImpl();
		List<Department> dlist=ds.getAllDeparment();
		request.setAttribute("dlist", dlist);
		RequestDispatcher rd=request.getRequestDispatcher("dept.jsp");
		rd.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
}
