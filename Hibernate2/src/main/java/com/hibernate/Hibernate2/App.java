package com.hibernate.Hibernate2;

import java.util.List;

import com.hibernate.Hibernate2.models.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App 
{
    public static void main(String[] args)
    {
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
    		EntityManager em = emf.createEntityManager();
    		
    		EntityTransaction et = em.getTransaction();
    		
    		et.begin();
    		
//    		Customer c1 = new Customer("One", "1234");
//    		Customer c2 = new Customer("Two", "5678");
//    		Customer c3 = new Customer("Three", "8787");
//    		Customer c4 = new Customer("Four", "6351");
//    		Customer c5 = new Customer("Five", "0971");
//    		em.persist(c1);
//    		em.persist(c2);
//    		em.persist(c3);
//    		em.persist(c4);
//    		em.persist(c5);

//    		Select * from Customer;
    		
    		Query q = em.createQuery("Select c from Customer c");
    		
    		List<Customer> list = q.getResultList();
    		
    		for(Customer c : list) {
    			System.out.println(c);
    		}
    		
//    		Customer cust = em.find(Customer.class, 1);
//    		
//    		if(cust != null) {
//    			em.remove(cust);
//    		} else {
//    			System.out.println("Customer id 3 not found");
//    		}
    		
    		Customer cust = em.find(Customer.class, 2);
    		
    		if(cust != null) {
    			cust.setName("Updated Two");
    		} else {
    			System.out.println("Customer id 2 not found");
    		}
    		
    		et.commit();
    }
}
