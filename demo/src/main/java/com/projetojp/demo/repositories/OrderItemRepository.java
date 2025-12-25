package com.projetojp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojp.demo.entities.OrderItem;
import com.projetojp.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	

}
