package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private static Connection con;
	private static PreparedStatement  psgetall;
	static {
		con=DBUtil.getMyConnection();
		try {
			psgetall=con.prepareStatement("select empno,ename,deptno,sal from emp where deptno=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Employee> findAllEmp(int deptno) {
		// TODO Auto-generated method stub
		
		List<Employee> elist=new ArrayList<>();
		try {
			psgetall.setInt(1, deptno);
			ResultSet rs=psgetall.executeQuery();
			while(rs.next()) {
				elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
			}
			System.out.println(elist);
			return elist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void closeDBConnection() {
		// TODO Auto-generated method stub
		DBUtil.closeConnection();
	}

}
