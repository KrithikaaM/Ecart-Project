package com.capg.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.capstore.beans.Customer;
import com.capg.capstore.beans.Merchant;
import com.capg.capstore.beans.Product;
import com.capg.capstore.service.SearchService;


@RestController
public class SearchController {

	
	@Autowired
	SearchService service;
	@RequestMapping("/getproducts/{search}")
	public List<Product> getProductById(@PathVariable String search)
	{
		return service.searchProduct( search);
	}
	
	
	@RequestMapping("/searchcustomer/{searchcustomer}")
	public List<Customer> searchCustomer(@PathVariable String searchcustomer)
	{
		return service.searchCustomer(searchcustomer);
		
	}
	@RequestMapping("/searchmerchant/{searchmerchant}")
	public List<Merchant> searchMerchant(@PathVariable String searchmerchant)
	{
		return service.searchMerchant(searchmerchant);
		
	}
}
