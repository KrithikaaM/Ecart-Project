package com.capg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.beans.Product;
import com.capg.repository.IProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepository repo;

	@Override
	public void feedbackAdd(int pid,String feedback){
		// TODO Auto-generated method stub
		Product pro=new Product();
	//	Product pro=new Product();
		pro.setId(pid);
		pro.setFeedback(feedback);
		repo.save(pro);
	}

}
