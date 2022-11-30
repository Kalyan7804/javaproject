package com.sportyshoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.dao.ProductsDao;
import com.sportyshoes.models.Products;

@Service
public class ProductService {
	@Autowired
	private ProductsDao productsDao;
	
	public List<Products> getallproducts(){
		return productsDao.getallproducts();
	}
	
	public Products getproductsbyid(Long id) {
		return productsDao.getproductbyid(id);
	}
	
	public Products addproduct(Products product) {
		return productsDao.addproduct(product);
	}
	
	public String updateproduct(Products product,Long id) {
		return productsDao.updateproduct(product, id);
	}
	
	public String deleteproduct(Long id) {
		return productsDao.deleteproductbyid(id);
	}
	
	

}
