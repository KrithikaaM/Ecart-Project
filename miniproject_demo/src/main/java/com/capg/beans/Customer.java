package com.capg.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	private String username;
	private String password;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String pid;
	private String cusfeedback;
	public Customer(String cusfeedback) {
		super();
		this.cusfeedback = cusfeedback;
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
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getCusfeedback() {
		return cusfeedback;
	}
	public void setCusfeedback(String cusfeedback) {
		this.cusfeedback = cusfeedback;
	}
	public Customer(String username, String password, String pid, String cusfeedback) {
		super();
		this.username = username;
		this.password = password;
		this.pid = pid;
		this.cusfeedback = cusfeedback;
	}
	public Customer(){
		
	}
	
	
	
	
	
}
