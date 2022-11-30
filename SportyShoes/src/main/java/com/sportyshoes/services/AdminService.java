package com.sportyshoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.dao.AdminDao;
import com.sportyshoes.models.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	public Admin addadmin(Admin admin) {
		return adminDao.addadmin(admin);
	}
	
	public List<Admin> getalladmins(){
		return adminDao.getalladmins();
	}
	
	public Admin getbyid(Long id) {
		System.out.println("getby id");
		return adminDao.getbyid(id);
		
	}
	
	public String updatebyid(Admin admin,Long id) {
		return adminDao.updatebyid(id, admin);
	}
	
	public String deletebyid(Long id){
		return adminDao.deletebyid(id);
	}
	
	public List<Admin> login(String username,String password) {
		return adminDao.Login(username, password);
	}
	

}
