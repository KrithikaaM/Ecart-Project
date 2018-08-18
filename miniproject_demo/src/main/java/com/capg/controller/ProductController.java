package com.capg.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.repository.IProductRepository;
import com.capg.service.IProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	IProductService service;
	@GetMapping(path="/addproducts" )
	public void feedbackAdd( @RequestParam ("pid") int pid,
			@RequestParam ("feedback") String feedback){
	/*	mp.put("pid", pid);
		mp.put("feedback", feedback);*/
		
	/*	Product pro=new Product();
		pro.setId(pid);
		pro.setFeedback(feedback);
		repo.save(pro);
		*/
		service.feedbackAdd(pid, feedback);
		
	}

}
