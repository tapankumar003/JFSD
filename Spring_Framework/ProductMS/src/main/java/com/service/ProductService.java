package com.service;

import java.util.List;

import com.entity.Product;

public interface ProductService {
	public String addProduct(Product product);
	public List<Product> getAllProduct();

}
