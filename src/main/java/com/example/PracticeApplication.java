package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.stream.Customer;
import com.example.stream.Order;
import com.example.stream.Product;
import com.example.stream.repo.CustomerRepository;
import com.example.stream.repo.OrderRepository;
import com.example.stream.repo.ProductRepository;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.stream")
public class PracticeApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		CREATNG CUSTOMERS
		
//		Customer customer = new Customer();
//		customer.setName("Nasser Khan");
//		customer.setTier(2);
//		
//		Customer customer2 = new Customer();
//		customer2.setName("Afrid Ali");
//		customer2.setTier(4);
//		
//		customerRepository.save(customer);
//		customerRepository.save(customer2);
		
//		CREATING PRODCUTS
		
		Product product = new Product("Black Shirt", "Men's wear", 670d);
		Product product2 = new Product("Blue checks Shirt", "Women's wear", 3450d);
		Product product3 = new Product("Black hoodie", "Men's wear", 6770d);
		Product product4 = new Product("Yellow Tshirt", "Men's wear", 1270d);
		Product product5 = new Product("Rolex Watch", "Watches", 12000d);
		
//		product = productRepository.save(product);
//		product5 = productRepository.save(product5);
//		product2 = productRepository.save(product2);
//		product3 = productRepository.save(product3);
//		product4 = productRepository.save(product4);
		
//		CREATING ORDERS
		
		Customer customer = customerRepository.findById(1).get();
		Customer customer2 = customerRepository.findById(2).get();
		
		HashSet<Product> set = new HashSet<>();
		set.add(product);
		set.add(product5);
		
		Order order = new Order(LocalDate.now(),LocalDate.of(2023, 2, 16),"PLACED",customer);
		order.setProducts(set);
		Order order2 = new Order(LocalDate.now(),LocalDate.of(2023, 4, 21),"PLACED",customer2);
		HashSet<Product> set2 = new HashSet<>();
		set2.add(product3);
		order2.setProducts(set2);
		Order order3 = new Order(LocalDate.now(),LocalDate.of(2023, 2, 14),"PLACED",customer);
		HashSet<Product> set3 = new HashSet<>();
		set3.add(product4);
		set3.add(product5);
		order3.setProducts(set3);
			
		
		
//		orderRepository.save(order);
//		orderRepository.save(order2);
//		orderRepository.save(order3);
	}

}
