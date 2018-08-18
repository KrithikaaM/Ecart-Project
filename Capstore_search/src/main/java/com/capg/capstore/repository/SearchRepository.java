package com.capg.capstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.capstore.beans.Customer;
import com.capg.capstore.beans.Merchant;
import com.capg.capstore.beans.Product;


	@Repository
	public interface SearchRepository {

		public List<Product> searchProduct(String search);
		public List<Customer> searchCustomer(String searchcustomer);
		public List<Merchant> searchMerchant(String searchmerchant);
	}

