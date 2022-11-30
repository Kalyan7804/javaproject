package com.sportyshoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.dao.CategoriesDao;
import com.sportyshoes.models.Categories;



@Service
public class CategorySerice {
	@Autowired
	private CategoriesDao categoriesDao;
	
	
	public List<Categories> getallCategories(){
		return categoriesDao.getallcategories();
	}
	
	public Categories getCategoriesbyid(Long id){
		return categoriesDao.getCategoriesbyid(id);
	}
	
	public Categories addCategories(Categories categories) {
		return categoriesDao.addcategories(categories);
	}
	
	
	public String updatecatbyid(Categories categories,Long id) {
		return categoriesDao.updatecatbyid(categories,id);
	}
	
	
	public String deletebyid(Long id) {
		return categoriesDao.deletebyid(id);
	}
	
	
	
	
	
	

}
