package com.akshat.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        
        Student student = (Student) context.getBean("student");
        Employee employee = (Employee) context.getBean("employee");
//        String string = (String) context.getBean("string");
        
        System.out.println(student);
        System.out.println(employee);
//        System.out.println(string);
    }
}
