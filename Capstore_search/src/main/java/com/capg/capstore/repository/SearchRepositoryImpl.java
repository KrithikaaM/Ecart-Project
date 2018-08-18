package com.capg.capstore.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.capstore.beans.Customer;
import com.capg.capstore.beans.Merchant;
import com.capg.capstore.beans.Product;

@Repository
public class SearchRepositoryImpl implements SearchRepository{

	@PersistenceContext
	private EntityManager entity;


	public List<Product> searchProduct(String search) {
	Product product = new Product();
	Query q = entity.createQuery("from Product where product_model='"+search+"' OR product_name='"+search+"' OR product_category='"+search+"'");
   // q.setParameter("name", search);
    
   /* q.setParameter("product_category", product.getCategory());
    q.setParameter("product_model", product.getModel());*/
    
    List<Product> prolist = q.getResultList();
	
		return prolist;
	}
	
	//admin searching customer details
	public List<Customer> searchCustomer(String searchcustomer)
	{
		Customer customer = new Customer();
		
		Query q1 = entity.createQuery("from Customer where custid='"+searchcustomer+"' OR username='"+searchcustomer+"'");
		List<Customer> custlist = q1.getResultList();
		
		
		return custlist;
	}
	
	//admin searching merchants
	public List<Merchant> searchMerchant(String searchmerchant)
	{
		Merchant merchant  = new Merchant();
		
		Query q2 = entity.createQuery("from Merchant where merchantId='"+searchmerchant+"' OR username='"+searchmerchant+"'OR merchantType='"+searchmerchant+"'");
        List<Merchant> merchantlist = q2.getResultList();
		
		
		return merchantlist;
	}
}
