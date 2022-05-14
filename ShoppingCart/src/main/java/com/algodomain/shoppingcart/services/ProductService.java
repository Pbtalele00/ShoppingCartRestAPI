package com.algodomain.shoppingcart.services;

import java.util.List;

import com.algodomain.shoppingcart.entity.Product;

public interface ProductService {

	 public List<Product> listAll();
	
	 public void save(Product product);
	 
	 public Product get(Long id);
	 
	 public void delete(Long id);

	public List<Product> getByNameOrCategoryOrPrice(String name, String category, Double price);
}