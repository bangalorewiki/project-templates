package inst.an.hibernate.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hopcroft.examples.domain.Car;

public class HibernateTestApp {
	public static void main(String[] args) {
		getAllCars();
	}
	
	public static List<Car> getAllCars(){
		List<Car> cars = null;
		Session newSession =
				HibernateUtil.getSessionFactory().openSession();
		HibernateUtil.getSessionFactory().openSession();
		Transaction newTransaction = newSession.beginTransaction();

		cars = newSession.createQuery("from Car").list();
		System.out.println( cars.size() +" car(s) found:" );
		
		newTransaction.commit();
		newSession.close();
		HibernateUtil.shutdown();
		return cars;
	}
}
