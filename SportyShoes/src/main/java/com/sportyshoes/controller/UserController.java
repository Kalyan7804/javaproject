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

import com.sportyshoes.models.Users;
import com.sportyshoes.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/user/login/{uname}/{pword}")
	public ResponseEntity<?> login(@PathVariable("uname") String username,
			@PathVariable("pword") String password){
		List<Users> user = userService.login(username, password);
	if (user!=null) {
		return new ResponseEntity<List<Users>>(user,HttpStatus.FOUND);
	}
	return new ResponseEntity<String>("something went wrong[check username and password]",HttpStatus.NOT_FOUND);		
	}
	
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getbyid(@PathVariable("id") Long id){
		Users user = userService.getbyid(id);
		if (user!=null) {
			return new ResponseEntity<Users>(user,HttpStatus.FOUND);			
		}
		return new ResponseEntity<String>("No record found",HttpStatus.NOT_FOUND);
	}
	@GetMapping("/user")
	public ResponseEntity<?> getbyid(){
		List<Users> allusers = userService.getallusers();
		if (allusers.isEmpty()==false) {
			return new ResponseEntity<List<Users>>(allusers,HttpStatus.FOUND);			
		}
		return new ResponseEntity<String>("No record found",HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> addadmin(@RequestBody Users user) {
		Users adduser = userService.adduser(user);
		if(adduser!=null) {
			return new ResponseEntity<Users>(adduser,HttpStatus.CREATED);			
		}
		return new ResponseEntity<String>("something went wrong[All fields are mandatory and username not to be same]"
										  ,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<String> updatebyid(@PathVariable("id") Long id,
											 @RequestBody Users user){
		return new ResponseEntity<String>(userService.updatebyid(user, id),HttpStatus.OK);
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> updatebyid(@PathVariable("id") Long id){
		return new ResponseEntity<String>(userService.deletebyid(id),HttpStatus.OK);
	}

}
