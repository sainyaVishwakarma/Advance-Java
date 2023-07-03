package com.java.service;

import java.util.List;

import com.java.beans.Product;
import com.java.dao.ProductDao;
import com.java.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	private ProductDao pdao;
	
	public ProductServiceImpl() {
		super();
		this.pdao = new ProductDaoImpl();
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return pdao.findAllProducts();
	}

	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.addNewProd(p);
	}

	@Override
	public int deleteById(int pid) {
		// TODO Auto-generated method stub
		return pdao.removeById(pid);
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return pdao.findById(pid);
	}

	@Override
	public int updateProduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.modifyById(p);
	}

}
