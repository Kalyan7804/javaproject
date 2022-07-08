package com.phase2.project.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase2.project.dto.Admin;
import com.phase2.project.dto.User;
import com.phase2.project.util.SessionFactoryManager;
import com.phase2.project.util.SessionFactoryManagerImpl;

public class AdminDao {
	private SessionFactoryManager ma;
	public AdminDao() {
		ma=new SessionFactoryManagerImpl();
	}
	
	public Admin getUser(String auname, String apword) {
		Transaction transaction=null;
		Admin admin=null;
		Session session=ma.getSessionFactory().openSession();
		transaction =session.beginTransaction();
		Query query=session.createQuery("from Admin where admin_username=:auname and admin_password=:apword");
		query.setParameter("auname", auname);
		query.setParameter("apword", apword);
		admin=(Admin)query.uniqueResult();
		transaction.commit();
		return admin;
		
	}
	
	
	public void achangePwd(String auname,String apassword) {
		Transaction transaction=null;
		Session session=ma.getSessionFactory().openSession();
		transaction=session.beginTransaction();
		Query query=session.createQuery("update Admin set admin_password=:apassword where admin_username=:auname");
		query.setParameter("apassword", apassword);
		query.setParameter("auname", auname);
		query.executeUpdate();
		transaction.commit();
	}
		
}
