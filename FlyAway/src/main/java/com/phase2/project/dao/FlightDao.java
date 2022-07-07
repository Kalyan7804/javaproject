package com.phase2.project.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase2.project.dto.Flight;
import com.phase2.project.util.SessionFactoryManager;
import com.phase2.project.util.SessionFactoryManagerImpl;

public class FlightDao {
	private SessionFactoryManager m2;

	public FlightDao() {
		m2 = new SessionFactoryManagerImpl();
	} 
	
	public ArrayList<Flight> getFlights(String origin, String destination,String date){
		Transaction transaction=null;
		ArrayList<Flight> flights=null;
		
		Session session=m2.getSessionFactory().openSession();
		transaction =session.beginTransaction();
		//transaction.begin();
		Query query=session.createQuery("from flights where flight_origin=:origin and flight_destination=:destination and flight_date=:date");
		
		query.setParameter("origin", origin);
		query.setParameter("destination", destination);
		query.setParameter("date", date);
		flights = (ArrayList<Flight>) query.getResultList();
		transaction.commit();
		
		return flights;
	}
}
