package com.phase2.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="user")
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="user_id")
	protected int idu;
	
	@Column(name="user_name")
	protected String username;
	
	@Column(name = "user_password")
	protected String password;
	
	@Column(name = "first_name")
	protected String fname;
	
	@Column(name = "last_name")
	protected String lname;
	
	@Column(name = "email")
	protected String mailid;
	
	@Column(name = "phone")
	protected String phone;
	
	public User() {}

	public User(String username, String password, String fname, String lname, String mailid, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.mailid = mailid;
		this.phone = phone;
	}

	public int getIdu() {
		return idu;
	}

	public void setIdu(int idu) {
		this.idu = idu;
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

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [idu=" + idu + ", username=" + username + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + ", mailid=" + mailid + ", phone=" + phone + "]";
	}

	
	
	
	
}
