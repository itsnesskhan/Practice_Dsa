package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// if remove this annotation we get application context exception
@SpringBootApplication 
public class PracticeApplication  {
	

	public static void main(String[] args) {
		
		try {
			SpringApplication.run(PracticeApplication.class, args);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


		


}
