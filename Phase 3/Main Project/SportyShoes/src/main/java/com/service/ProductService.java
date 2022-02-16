package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Categories;
import com.entity.Product;
import com.jdbc.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository prodrepo;
	
	public List<Product> listAll()
	{
		return prodrepo.findAll();
	}
	
	public void save(Product product)
	{
		prodrepo.save(product);
	}

}
