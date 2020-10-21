package com.pacheco.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacheco.webservicesspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
