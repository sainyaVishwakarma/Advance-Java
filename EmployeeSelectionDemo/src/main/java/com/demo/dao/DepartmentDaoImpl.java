package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.demo.beans.Department;

public class DepartmentDaoImpl implements DepartmentDao{
	private static Connection con;
	private static PreparedStatement psgetall;
	static {
		con=DBUtil.getMyConnection();
		try {
			psgetall=con.prepareStatement("select deptno,dname,loc from dept");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Department> findAllDept() {
		// TODO Auto-generated method stub
		try {
			List<Department> dlist=new ArrayList<>();
			ResultSet rs=psgetall.executeQuery();
			while(rs.next()) {
				dlist.add(new Department(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			return dlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
