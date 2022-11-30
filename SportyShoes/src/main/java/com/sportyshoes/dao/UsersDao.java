package com.sportyshoes.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sportyshoes.models.Users;
import com.sportyshoes.repository.userrepo;

@Repository
public class UsersDao {
	@Autowired
	private userrepo userrepo;

	
	public Users adduser(Users users) {
		try {
			return userrepo.saveAndFlush(users);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	public Users getbyid(Long id) {
		try {
			Optional<Users> data = userrepo.findById(id);
			return data.get();			
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	public List<Users> getalluser(){
		try {
			return userrepo.findAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	public String updatebyid(Long id,Users user) {
		try {
			Optional<Users> data = userrepo.findById(id);
			Users olduser = data.get();
			if (user.getFname()!=null) {
				olduser.setFname(user.getFname());				
			}
			if (user.getLname()!=null) {
				olduser.setLname(user.getLname());				
			}
			if (user.getAddress()!=null) {
				olduser.setAddress(user.getAddress());				
			}
			if (user.getPhoneno()!=null) {
				olduser.setPhoneno(user.getPhoneno());				
			}
			if (user.getUsername()!=null) {
				olduser.setUsername(user.getUsername());				
			}
			if (user.getPassword()!=null) {
				olduser.setPassword(user.getPassword());				
			}
			userrepo.saveAndFlush(olduser);
			return "changes save successfully";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String deletebyid(Long id) {
		try {
			userrepo.deleteById(id);
			return "Record deleted successfully";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	public List<Users> Login(String username,String password) {
		try {
			List<Users> users = userrepo.findByUsernameAndPassword(username, password);
			if (users.isEmpty()!=true) {
				return users;					
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}
