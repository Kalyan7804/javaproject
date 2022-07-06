package com.hibernate.beans.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.beans.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Student st1=new Student("arsha","verma","A+");
		Student st2=new Student("datta","das","A+");
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		int rollno=(int) session.save(st1);
		session.save(st2);
		System.out.println("roll no of "+st1.getLname()+" is "+rollno);
		// if not commited the changes will not reflect in to dbx
		transaction.commit();
		
		factory.close();

	}

}
