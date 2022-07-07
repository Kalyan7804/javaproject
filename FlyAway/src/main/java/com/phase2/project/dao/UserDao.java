package com.phase2.project.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase2.project.dto.User;
import com.phase2.project.util.SessionFactoryManager;
import com.phase2.project.util.SessionFactoryManagerImpl;

public class UserDao {
	private SessionFactoryManager m1;

	public UserDao() {
		m1= new SessionFactoryManagerImpl();
	}
	
	public void addUser(User user) {
		Transaction transaction=null;
		Session session=m1.getSessionFactory().openSession();
		transaction =session.beginTransaction();
		session.save(user);
		transaction.commit();
		
	}
	
	public void changePwd(String uname,String password) {
		Transaction transaction=null;
		Session session=m1.getSessionFactory().openSession();
		transaction=session.beginTransaction();
		Query query=session.createQuery("update user set user_password=:password where user_name=:uname");
		query.setParameter("password", password);
		query.setParameter("uname", uname);
		query.executeUpdate();
		transaction.commit();
	}
	
	public User getUser(String uname, String pword) {
		Transaction transaction=null;
		User user=null;
		Session session=m1.getSessionFactory().openSession();
		transaction =session.beginTransaction();
		Query query=session.createQuery("from User where user_name=:uname and user_password=:pword");
		query.setParameter("uname", uname);
		query.setParameter("pword", pword);
		user=(User)query.uniqueResult();
		transaction.commit();
		return user;
		
	}

}
