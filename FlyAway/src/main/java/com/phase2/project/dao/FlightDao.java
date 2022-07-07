package com.phase2.project.dao;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.phase2.project.dto.Flights;
import com.phase2.project.util.SessionFactoryManager;
import com.phase2.project.util.SessionFactoryManagerImpl;

public class FlightDao {
	private SessionFactoryManager m2;

	public FlightDao() {
		m2 = new SessionFactoryManagerImpl();
	} 
	
	public ArrayList<Flights> getFlights(String origin, String destination,String date){
		Transaction transaction=null;
		ArrayList<Flights> flights=null;
		
		Session session=m2.getSessionFactory().openSession();
		transaction =session.beginTransaction();
		//transaction.begin();
		Query query=session.createQuery("from Flights where origin=:origin and destination=:destination and date=:date");
		
		query.setParameter("origin", origin);
		query.setParameter("destination", destination);
		query.setParameter("date", date);
		flights = (ArrayList<Flights>) query.getResultList();
		transaction.commit();
		 
		System.out.println(flights);
		
		return flights;
	}
	
	public Flights getFlightById(int flightidi) {
		Flights flight=null;
		Transaction transaction=null;
		Session session=m2.getSessionFactory().openSession();
		transaction =session.beginTransaction();
		Query query=session.createQuery("from Flights where id=:flightidi");
		query.setParameter("flightidi", flightidi);
		flight=(Flights) query.getSingleResult();
		transaction.commit();
		
		return flight;
	}
}
