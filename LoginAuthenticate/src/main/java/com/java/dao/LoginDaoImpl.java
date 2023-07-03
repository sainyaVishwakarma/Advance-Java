package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.beans.MyUser;
import com.java.beans.RegisterUser;

public class LoginDaoImpl implements LoginDao{
	private static Connection con;
	private static PreparedStatement ps,psins,psuserins;
	static {
		con=DBUtil.getMyConnection();
		try {
			ps=con.prepareStatement("select * from user where uname=? and password=?");
			psins=con.prepareStatement("insert into registeruser values(?,?,?,?,?,?,?,?)");
			psuserins=con.prepareStatement("insert into user values(?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public MyUser authenticateUser(String uname, String pass) {
		// TODO Auto-generated method stub
		
		try {
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int registerUser(RegisterUser r, MyUser user) {
		// TODO Auto-generated method stub
		try {
			psins.setInt(1,r.getUid());
			psins.setString(2, r.getName());
			psins.setString(3, r.getAddr());
			psins.setString(4, r.getUname());
			psins.setString(5, r.getSkills()[0]);
			psins.setString(6, r.getGender());
			psins.setDate(7,null);
			psins.setString(8, r.getCity());
			psins.executeUpdate();
			psuserins.setString(1, user.getUname());
			psuserins.setString(2, user.getPassword());
			psuserins.setString(3, user.getRole());
			return psuserins.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
