package com.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sportyshoes.models.Categories;
import com.sportyshoes.services.CategorySerice;

@Controller
public class CategoryController {
	
	@Autowired
	private CategorySerice cateSerice;
	
	@GetMapping("/admin/categories/{id}")
	public ResponseEntity<?> getcategoriesbyid(@PathVariable("id")Long id){
		Categories categories = cateSerice.getCategoriesbyid(id);
		if (categories!=null) {
			return new ResponseEntity<Categories>(categories,HttpStatus.FOUND);			
		}
		return new ResponseEntity<String>("No records Avaliable",HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/admin/categories")
	public ResponseEntity<?> getallcategories(){
		List<Categories> categories = cateSerice.getallCategories();
		if (categories.isEmpty()!=true) {
			return new ResponseEntity<List<Categories>>((List<Categories>)categories,HttpStatus.FOUND);			
		}
		return new ResponseEntity<String>("No records Avaliablee",HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/admin/categories")
	public ResponseEntity<?> addcategories(@RequestBody Categories categories) {
		Categories addcat = cateSerice.addCategories(categories);
		if (addcat != null) {
			return new ResponseEntity<Categories>(addcat, HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("This Category is already exists", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/admin/categories/{id}")
	public ResponseEntity<String> updatecatbyid(@PathVariable("id") Long id, @RequestBody Categories categories) {	
		return new ResponseEntity<String>(cateSerice.updatecatbyid(categories, id), HttpStatus.OK);
	}

	@DeleteMapping("/admin/categories/{id}")
	public ResponseEntity<String> deletebyid(@PathVariable("id") Long id) {
		return new ResponseEntity<String>(cateSerice.deletebyid(id), HttpStatus.OK);
	}
	

}
