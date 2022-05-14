package com.algodomain.shoppingcart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.shoppingcart.entity.Product;
import com.algodomain.shoppingcart.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	 	@Autowired
	    private ProductRepository repo;
	     
	    public List<Product> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Product product) {
	        repo.save(product);
	    }
	     
	    public Product get(Long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Long id) {
	        repo.deleteById(id);
	    }
	    
	    public List<Product> getByNameOrCategoryOrPrice(String name, String category, Double price){
			return repo.findByNameOrCategoryOrPrice(name, category, price);
	    
	    }
	    
}
