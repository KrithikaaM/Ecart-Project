package com.capg.capstore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custid;
	private String username;
	private String password;
	//private Product product;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}*/
	public Customer(int custid, String username, String password) {
		super();
		this.custid = custid;
		this.username = username;
		this.password = password;
		//this.product = product;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
	
}
