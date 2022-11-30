package com.sportyshoes.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class Users {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long id;
	
	@Column(name = "user_fname", nullable = false)
	private String fname;

	@Column(name = "user_lname", nullable = false)
	private String lname;

	@Column(name = "user_phoneno", length = 10, nullable = false)
	private Long phoneno;

	@Column(name = "user_address", nullable = false)
	private String address;

	@Column(name = "user_username", nullable = false, unique = true)
	private String username;

	@Column(name = "user_password", nullable = false)
	private String password;
	
	@ManyToMany(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Order> order;

	public Users(long id, String fname, String lname, Long phoneno, String address, String username, String password,
			List<Order> order) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = phoneno;
		this.address = address;
		this.username = username;
		this.password = password;
		this.order = order;
	}
	
	public Users(String fname, String lname, Long phoneno, String address, String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phoneno = phoneno;
		this.address = address;
		this.username = username;
		this.password = password;
	}
	
	
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Users() {}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Long getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Order> getOrder() {
		return order;
	}


	public void setOrder(List<Order> order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phoneno=" + phoneno + ", address="
				+ address + ", username=" + username + ", password=" + password + ", order=" + order + "]";
	}
	
	
	

}
