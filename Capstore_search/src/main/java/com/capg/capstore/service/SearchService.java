package com.capg.capstore.service;

import java.util.List;
import java.util.Optional;

import com.capg.capstore.beans.Customer;
import com.capg.capstore.beans.Merchant;
import com.capg.capstore.beans.Product;



public interface SearchService {

	
	public List<Product> searchProduct(String search);
	public List<Customer> searchCustomer(String searchcustomer);
	public List<Merchant> searchMerchant(String searchmerchant);
}
