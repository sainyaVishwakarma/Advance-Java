package com.java.service;

import java.util.List;

import com.java.beans.Product;

public interface ProductService {

	List<Product> getAllProducts();

	int addProduct(Product p);

	int deleteById(int pid);

	Product getById(int pid);

	int updateProduct(Product p);

}
