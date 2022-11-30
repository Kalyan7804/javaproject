package com.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sportyshoes.models.Admin;
import com.sportyshoes.services.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService admnService;
	
	@GetMapping("/admin/login/{uname}/{pword}")
	public ResponseEntity<?> login(@PathVariable("uname") String username,
			@PathVariable("pword") String password){
		List<Admin> admin = admnService.login(username, password);
	if (admin!=null) {
		return new ResponseEntity<List<Admin>>(admin,HttpStatus.FOUND);
	}
	return new ResponseEntity<String>("something went wrong[check username and password]",HttpStatus.NOT_FOUND);		
	}
	
	
	@GetMapping("/admin/{id}")
	public ResponseEntity<?> getbyid(@PathVariable("id") Long id){
		Admin admin = admnService.getbyid(id);

		if(admin!=null) {
			System.out.println(admin);
			
			return new ResponseEntity<Admin>(admin,HttpStatus.FOUND);			
		}
		else {return new ResponseEntity<String>("No record found",HttpStatus.NOT_FOUND);
		
		}
	}
	
	@GetMapping("/admin")
	public ResponseEntity<?> getbyid(){
		List<Admin> alladmins = admnService.getalladmins();
		if (alladmins.isEmpty()==false) {
			return new ResponseEntity<List<Admin>>(alladmins,HttpStatus.FOUND);			
		}
		return new ResponseEntity<String>("No record found",HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/admin")
	public ResponseEntity<?> addadmin(@RequestBody Admin admin) {
		Admin addadmin = admnService.addadmin(admin);
		if(addadmin!=null) {
			return new ResponseEntity<Admin>(addadmin,HttpStatus.CREATED);			
		}
		return new ResponseEntity<String>("something went wrong[All fields are mandatory and username not to be same]"
										  ,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PutMapping("/admin/{id}")
	public ResponseEntity<String> updatebyid(@PathVariable("id") Long id,
											 @RequestBody Admin admin){
		return new ResponseEntity<String>(admnService.updatebyid(admin, id),HttpStatus.OK);
	}
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<String> updatebyid(@PathVariable("id") Long id){
		return new ResponseEntity<String>(admnService.deletebyid(id),HttpStatus.OK);
	}
	
	
	
	

}
