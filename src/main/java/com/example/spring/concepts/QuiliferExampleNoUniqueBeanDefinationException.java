package com.example.spring.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface MyInterface{}

//either make any of it primary
@Primary
@Component
class MyInterFaceImpl1 implements MyInterface {
	
}

@Component
class MyInterFaceImpl2 implements MyInterface{
	
}

@Component
public class QuiliferExampleNoUniqueBeanDefinationException {

//	@Qualifier("myInterFaceImpl2")
	@Autowired
	private MyInterface myInterface;

}
