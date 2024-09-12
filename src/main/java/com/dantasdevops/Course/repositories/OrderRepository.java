package com.dantasdevops.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dantasdevops.Course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
