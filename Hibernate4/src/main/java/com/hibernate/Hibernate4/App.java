package com.hibernate.Hibernate4;

import com.hibernate.Hibernate4.models.Customer;
import com.hibernate.Hibernate4.models.Customer_Details;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();
		
		Customer c1 = new Customer(1, "One");
		Customer_Details cd1 = new Customer_Details(101, "1234", "one@gmail.com", "ABCD Road");
		
		c1.setCustomer_details(cd1);
		
//		em.persist(c1);
		
		Customer cf = em.find(Customer.class, 1);
//		
		if(cf != null) {
			System.out.println(cf);
			
			cf.setName("Updated One");
		}
//		
//		em.remove(cf);
		
		et.commit();
	}
}
