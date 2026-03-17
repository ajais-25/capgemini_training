package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@RequestMapping("/")
	public String show() {
		return "Hey, how're you doing";
	}
	
}
