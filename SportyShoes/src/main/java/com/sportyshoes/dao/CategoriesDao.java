package com.sportyshoes.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sportyshoes.models.Categories;
import com.sportyshoes.repository.categoryrepo;

@Repository
public class CategoriesDao {
	@Autowired
	private categoryrepo categoryrepo;
	
	public List<Categories> getallcategories(){
		try {
			return categoryrepo.findAll();
		} catch (Exception e) {
			 e.getStackTrace();
		}
		return null;
	}
	
	public Categories getCategoriesbyid(Long id) {
		try {
			Optional<Categories> data=categoryrepo.findById(id);
			return data.get();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}
	
	
	public Categories addcategories(Categories categories) {
		List<Categories> name = (List<Categories>) categoryrepo.findByName(categories.getName());
		for (Categories cat : name) {
			if (cat.getName().contains(categories.getName())) {		
				return null;				
			}
		}
		return categoryrepo.save(categories);
	}
	
	
	public String updatecatbyid(Categories categories,Long id) {
		Optional<Categories> findById = categoryrepo.findById(id);
		Categories oldcategories = findById.get();
		if (categories.getName()!=null) {
			oldcategories.setName(categories.getName());			
		}
		if (categories.getDesc()!=null) {
			oldcategories.setDesc(categories.getDesc());
		}
		try {
			if (categoryrepo.findById(id).isPresent()) {
				categoryrepo.updatecat(categories.getName(), categories.getDesc(), id);
				return "category updated successfully";				
			}
		} catch (Exception e) {
			return e.getMessage();
			
		}
		return "No record found...";
	}
	
	
	public String deletebyid(Long id) {
		try {
			categoryrepo.deleteById(id);
			
		} catch (Exception e) {
			return e.getMessage();
		}
		return "record deleted successfully";
	}

	
	
}
