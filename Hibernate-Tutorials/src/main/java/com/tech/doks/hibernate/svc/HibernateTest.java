package com.tech.doks.hibernate.svc;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tech.doks.hibernate.models.UserDetails;
import com.tech.doks.hibernate.models.Vehicle;

public class HibernateTest {
	private static final Logger logger = Logger.getLogger(HibernateTest.class);
	public static void main(String[] args) {
		logger.info("From Main class");
		UserDetails user = new UserDetails();
		Vehicle vehical = new Vehicle();
		Vehicle vehical2 = new Vehicle();
		user.setUserName("DOK$");
		vehical.setVehicalName("Car");
		vehical2.setVehicalName("Jeep");
		user.getVehical().add(vehical);
		user.getVehical().add(vehical2);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehical);
		session.save(vehical2);
		session.getTransaction().commit();
		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("User_Name :: " + user.getUserName());
	}

}
