package com.sportyshoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.dao.UsersDao;
import com.sportyshoes.models.Users;

@Service
public class UserService {
	@Autowired
	private UsersDao usersDao;
	
	public Users adduser(Users user) {
		return usersDao.adduser(user);
	}
	
	public List<Users> getallusers(){
		return usersDao.getalluser();
	}
	
	public Users getbyid(Long id) {
		return usersDao.getbyid(id);
	}
	
	public String updatebyid(Users user,Long id) {
		return usersDao.updatebyid(id, user);
	}
	
	public String deletebyid(Long id){
		return usersDao.deletebyid(id);
	}
	
	public List<Users> login(String username,String password) {
		return usersDao.Login(username, password);
	}
	

}
