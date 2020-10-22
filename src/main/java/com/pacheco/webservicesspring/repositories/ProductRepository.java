package com.pacheco.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacheco.webservicesspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
