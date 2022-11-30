package com.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.models.Users;

public interface userrepo extends JpaRepository<Users, Long>{
	public List<Users> findByUsernameAndPassword(String username,String password);

}
