package com.example.spring.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//if not putting component annotation we get NoSuchBeanDefinationException
@Component
class Employee{
	
}

@Component
public class NoSuchBeanDefinationExeptionExample {

	@Autowired
	private Employee employee;
}
