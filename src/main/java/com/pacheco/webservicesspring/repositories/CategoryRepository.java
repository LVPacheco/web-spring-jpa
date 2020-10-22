package com.pacheco.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacheco.webservicesspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
