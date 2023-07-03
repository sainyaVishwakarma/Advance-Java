package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;
	public static Connection getMyConnection() {
		System.out.println("aaaaa");
		try {
			if(con==null) {
				System.out.println(con + "   con ");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String  url="jdbc:mysql://192.168.10.150:3306/dac23_campus";
			con=DriverManager.getConnection(url,"dac23","welcome");
			
			System.out.println(con + "   con ");
			if(con!=null) {
				System.out.println("connection done!");
			}
			return con;
			}}catch(SQLException e) {
			System.out.println("error occured");
			return null;
		}
		return con;
		
	}
	
	public static void closeConnection() {
		try {
		if(con!=null) {
			con.close();
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
				
	}
