package com.capg.spring.bean;

import java.math.BigDecimal;


public class Product {
	

	
	private int id;
	
	private String model;
	private String name;
	private BigDecimal price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/*@Override
	public String toString() {
		return "Product [id=" + id + ", model=" + model + ", name=" + name + ", price=" + price + "]";
	}*/
	public Product(int id, String model, String name, BigDecimal price) {
		super();
		this.id = id;
		this.model = model;
		this.name = name;
		this.price = price;
	}
	
	
	public Product() {
		
	}

}
