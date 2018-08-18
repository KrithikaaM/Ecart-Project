package com.capg.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="search_product")
public class Product {

	//entitty:automatic table generation
	//generatevalue:generate id value automatic (primary key)
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
		
	
	public Product(int id, String name, String model, double price, String feedback, String category) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.feedback = feedback;
		this.category = category;
	}
	@Column(name="product_name")
	private String name;
	@Column(name="product_model")
	private String model;
	@Column(name="product_price")
	private double price;
	
	@Column(name="product_feedback")
	private String feedback;
	@Column(name="product_category")
	private String category;
	
	
	
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + ", feedback="
				+ feedback + ", category=" + category + "]";
	}
	public Product() {
		
	}
	
	
	
}
