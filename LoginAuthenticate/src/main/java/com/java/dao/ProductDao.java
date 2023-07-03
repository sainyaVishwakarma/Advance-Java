package com.java.dao;

import java.util.List;

import com.java.beans.Product;

public interface ProductDao {

	List<Product> findAllProducts();

	int addNewProd(Product p);

	int removeById(int pid);

	Product findById(int pid);

	int modifyById(Product p);

}
