package com.phase2.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_user")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="admin_id")
	protected int adminid;
	
	@Column(name = "admin_username")
	protected String adminusername;
	
	@Column(name = "admin_password")
	protected String adminpassword;
	
	public Admin() {}

	public Admin(int adminid, String adminusername, String adminpassword) {
		super();
		this.adminid = adminid;
		this.adminusername = adminusername;
		this.adminpassword = adminpassword;
	}

	public Admin(String adminusername, String adminpassword) {
		super();
		this.adminusername = adminusername;
		this.adminpassword = adminpassword;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAdminusername() {
		return adminusername;
	}

	public void setAdminusername(String adminusername) {
		this.adminusername = adminusername;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminusername=" + adminusername + ", adminpassword=" + adminpassword
				+ "]";
	}
	
	
}
