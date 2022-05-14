package com.algodomain.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.shoppingcart.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByNameOrCategoryOrPrice(String name, String category, Double price);
}
