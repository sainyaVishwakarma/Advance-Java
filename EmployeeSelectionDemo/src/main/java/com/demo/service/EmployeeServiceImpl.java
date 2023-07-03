package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;

	public EmployeeServiceImpl() {
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public List<Employee> getAllEmp(int deptno) {
		// TODO Auto-generated method stub
		return edao.findAllEmp(deptno);
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		edao.closeDBConnection();
	}
	
}
