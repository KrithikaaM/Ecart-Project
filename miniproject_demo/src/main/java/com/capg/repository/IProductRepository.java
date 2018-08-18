package com.capg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.beans.Product;


@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {

}
