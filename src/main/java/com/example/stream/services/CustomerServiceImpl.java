package com.example.stream.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stream.repo.CustomerRepository;

@Service
public class CustomerServiceImpl {

	@Autowired
	private CustomerRepository customerRepository;
	
}
