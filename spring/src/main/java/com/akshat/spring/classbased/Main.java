package com.akshat.spring.classbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		People people = context.getBean(People.class);
		Bike bike = context.getBean(Bike.class);
		PojoClass pojo = context.getBean(PojoClass.class);
		
		System.out.println(people);
		System.out.println(bike);
		System.out.println(pojo);
	}

}
