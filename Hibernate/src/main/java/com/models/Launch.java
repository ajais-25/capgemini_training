package com.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Launch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Employee e1 = new Employee(1, "Akshat Jaiswal", "akshatjaiswal@gmail.com", "1234567890");
		s.save(e1);
		
		Employee e = s.get(Employee.class, 1);
		System.out.println(e);
		
		s.delete(e);
		
		Transaction t = s.beginTransaction();
		t.commit();
	}

}
