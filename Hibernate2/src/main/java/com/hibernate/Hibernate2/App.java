package com.hibernate.Hibernate2;

import com.hibernate.Hibernate2.models.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main(String[] args)
    {
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
    		EntityManager em = emf.createEntityManager();
    		
    		EntityTransaction et = em.getTransaction();
    		
    		et.begin();
    		
    		Customer c1 = new Customer("One", "1234");
    		
    		em.persist(c1);    		
    		
    		et.commit();
    }
}
