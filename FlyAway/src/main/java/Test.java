import org.hibernate.Session;
import org.hibernate.Transaction;


import com.phase2.project.dto.Flights;
import com.phase2.project.util.SessionFactoryManager;
import com.phase2.project.util.SessionFactoryManagerImpl;

public class Test {
	
	
	public static void main(String[] args) {
		SessionFactoryManager m4=new SessionFactoryManagerImpl();
		
		Session session=m4.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		
		
		//Flights flight1=new Flights(101,"Hyderabad","Delhi","2022-08-01","Indigo","02:00:00",5500);
		Flights flight2=new Flights("Hyderabad","Delhi","2022-08-01","AirIndia","03:00:00",7500);
		
		//session.save(flight1);
		session.save(flight2);
		transaction.commit();
		session.close();

	}

}
