package com.example.stream;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "product_order")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NonNull
  private LocalDate orderDate;
  @NonNull
  private LocalDate deliveryDate;
  @NonNull
  private String status;
  
  @ManyToOne
  @NonNull
  @JoinColumn(name = "customer_id")
  private Customer customer;
  
  @ManyToMany
  @JoinTable(
      name = "order_product_relationship",
      joinColumns = { @JoinColumn(name = "order_id") },
      inverseJoinColumns = { @JoinColumn(name = "product_id") }
  )
  @ToString.Exclude
  Set<Product> products;
    
}

