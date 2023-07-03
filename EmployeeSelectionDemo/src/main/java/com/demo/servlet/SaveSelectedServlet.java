package com.demo.servlet;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.demo.beans.Employee;
/**
 * Servlet implementation class SaveSelectedServlet
 */
@WebServlet("/saveselected")
public class SaveSelectedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] selemp=request.getParameterValues("sel");
		int deptno=Integer.parseInt(request.getParameter("dept"));
		HttpSession session=request.getSession();
		Set<Employee> eset=(Set<Employee>)session.getAttribute("eset");
		if(eset==null) {
			eset=new HashSet<>();
		}
		for(String emp:selemp) {
			String[] empdata=emp.split(":");
			Employee e=new Employee(Integer.parseInt(empdata[0]),empdata[1],deptno,Integer.parseInt(empdata[2]));
			eset.add(e);
		}
		session.setAttribute("eset", eset);
		RequestDispatcher rd=request.getRequestDispatcher("departments");
		System.out.println(eset);
		rd.forward(request,response);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
