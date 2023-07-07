package com.example.stream.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stream.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
