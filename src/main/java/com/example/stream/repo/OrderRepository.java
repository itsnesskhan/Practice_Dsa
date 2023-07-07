package com.example.stream.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stream.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
