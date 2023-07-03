package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	List<Employee> findAllEmp(int deptno);

	void closeDBConnection();

}
