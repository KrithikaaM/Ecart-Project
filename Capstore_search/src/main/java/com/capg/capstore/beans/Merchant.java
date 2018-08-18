package com.capg.capstore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Merchant")
public class Merchant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int merchantId;
	private String username;
	private String password;
	private String merchantType;
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
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
	public String getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", username=" + username + ", password=" + password
				+ ", merchantType=" + merchantType + "]";
	}
	public Merchant(int merchantId, String username, String password, String merchantType) {
		super();
		this.merchantId = merchantId;
		this.username = username;
		this.password = password;
		this.merchantType = merchantType;
	}
	public Merchant() {
		super();
	}
	
	
	
	
	
	
	
}
