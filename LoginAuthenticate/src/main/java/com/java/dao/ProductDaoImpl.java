package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.java.beans.Product;

public class ProductDaoImpl implements ProductDao{
	private static Connection con;
	private static PreparedStatement ps1,psadd,psdel,psgetbyid,psupdate;
	static {
		con=DBUtil.getMyConnection();
			try {
				ps1=con.prepareStatement("select * from product");
				psadd=con.prepareStatement("insert into product values(?,?)");
				psdel=con.prepareStatement("delete from product where pid=?");
				psgetbyid=con.prepareStatement("select * from product where pid=?");
				psupdate=con.prepareStatement("update product set pdes=?");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		try {
		ResultSet rs=ps1.executeQuery();
		List<Product> plist1=new ArrayList<>();
		while(rs.next()) {
			plist1.add(new Product (rs.getInt(1),rs.getString(2)));
		}
		return plist1;
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int addNewProd(Product p) {
		// TODO Auto-generated method stub
		try {
			psadd.setInt(1, p.getProdid());
			psadd.setString(2, p.getDescrip());
			return psadd.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}
	@Override
	public int removeById(int pid) {
		// TODO Auto-generated method stub
		try {
			psdel.setInt(1, pid);
			return psdel.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public Product findById(int pid) {
		// TODO Auto-generated method stub
		try {
			psgetbyid.setInt(1, pid);
			ResultSet rs=psgetbyid.executeQuery();
			if(rs.next()) {
				return new Product(rs.getInt(1),rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int modifyById(Product p) {
		// TODO Auto-generated method stub
		try {
			psupdate.setString(1, p.getDescrip());
			return psupdate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	

}
