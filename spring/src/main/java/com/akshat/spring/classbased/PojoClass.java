package com.akshat.spring.classbased;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PojoClass {

	@Autowired
	private Bike bike;
	@Autowired
	private People people;
	
	@Autowired
	private List<Integer> peoples;

	@Override
	public String toString() {
		return "PojoClass [bike=" + bike + ", people=" + people + ", peoples=" + peoples + "]";
	}
}
