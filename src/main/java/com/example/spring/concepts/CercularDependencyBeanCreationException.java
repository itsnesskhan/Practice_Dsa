package com.example.spring.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class Emp{
	
	@Autowired
	private Department department;
}

@Component
class Department{
	
	// use lazy annotation on one of the dependency to overcome this issue
	@Lazy 
	@Autowired
	private Emp emp;
}

//due to circular dependency we get BeanCurrentlyInCreationException