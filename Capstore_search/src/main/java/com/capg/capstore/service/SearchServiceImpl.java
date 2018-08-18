package com.capg.capstore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.capstore.beans.Customer;
import com.capg.capstore.beans.Merchant;
import com.capg.capstore.beans.Product;
import com.capg.capstore.repository.SearchRepository;


@Service
@Transactional
public class SearchServiceImpl implements SearchService {

	
	@Autowired
	private SearchRepository repo;
	
	
	public List<Product> searchProduct(String search) { //Optional: if(id found) return pro else return null;
		
		return repo.searchProduct(search); //findbuid : CRUD repo api
	}
	
	public List<Customer> searchCustomer(String searchcustomer){
		return repo.searchCustomer(searchcustomer);
	}
	
	public List<Merchant> searchMerchant(String searchmerchant)
	{
		return repo.searchMerchant(searchmerchant);
	}
}
