package com.algodomain.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	private String name;
	private String category;
	private double minPrice;
	private double maxPrice;
	private double price;
	
	public Product() {
		super();
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(long productId, String name, String category, double minPrice, double maxPrice,double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.price = price;
	}
	
	public long getProductId() {
		return productId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}
	public double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", minPrice="
				+ minPrice + ", maxPrice=" + maxPrice + "]";
	}
	
}
