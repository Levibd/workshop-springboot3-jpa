package com.dantasdevops.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dantasdevops.Course.entities.OrderItem;
import com.dantasdevops.Course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
