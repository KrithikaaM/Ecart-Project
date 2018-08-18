package com.capg.spring.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.spring.bean.Product;

@RestController
public class ProductFrontController {
	
	@RequestMapping("/products" )
	public Product getProduct( @RequestParam ("pid") String pid,
			@RequestParam ("feedback") String feedback ) {
		RestTemplate rt=new RestTemplate();
		Product p=rt.getForObject("http://localhost:9080/addproducts?pid="+pid+"&feedback="+feedback,Product.class );
		return p;
		
		
	}

}
