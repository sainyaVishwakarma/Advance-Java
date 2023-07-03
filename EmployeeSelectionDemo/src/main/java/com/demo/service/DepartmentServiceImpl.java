package com.demo.service;

import java.util.List;

import com.demo.beans.Department;
import com.demo.dao.DepartmentDao;
import com.demo.dao.DepartmentDaoImpl;

public class DepartmentServiceImpl implements DepartmentService{
	private DepartmentDao deptdao;
	
	public DepartmentServiceImpl() {
		
		this.deptdao = new DepartmentDaoImpl();
	}

	@Override
	public List<Department> getAllDeparment() {
		// TODO Auto-generated method stub
		return deptdao.findAllDept();
	}

}
