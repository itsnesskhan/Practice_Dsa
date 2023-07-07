package com.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.stream.Order;
import com.example.stream.Product;
import com.example.stream.repo.CustomerRepository;
import com.example.stream.repo.OrderRepository;
import com.example.stream.repo.ProductRepository;

@Component
public class StreamPracticePart2 {
	
	@Autowired
	private static OrderRepository orderRepository;
	
	@Autowired
	private static ProductRepository productRepository;
	
	@Autowired
	private static CustomerRepository customerRepository;

	public static void main(String[] args) {
		
//		Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
		
		List<Product> allProducts = productRepository.findAll();
		
		List<Product> products2 = allProducts.stream().filter(
				pro->pro.getCategory().equalsIgnoreCase("Men's wear") && pro.getPrice()>1000
		).collect(Collectors.toList());
		
		System.out.println(products2);
		
//		Exercise 2 — Obtain a list of order with products belong to category “Baby”
		
		List<Order> allOrders = orderRepository.findAll();
		allOrders.stream().filter(order->order.getProducts().stream().anyMatch(pro->pro.getCategory().equals("Watches"))).collect(Collectors.toList());

		
	}
}
