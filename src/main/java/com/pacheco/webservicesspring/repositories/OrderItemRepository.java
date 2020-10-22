package com.pacheco.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacheco.webservicesspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
