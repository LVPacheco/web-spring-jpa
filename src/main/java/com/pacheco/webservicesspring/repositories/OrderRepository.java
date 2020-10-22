package com.pacheco.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacheco.webservicesspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
