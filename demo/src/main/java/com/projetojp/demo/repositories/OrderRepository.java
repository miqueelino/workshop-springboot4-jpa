package com.projetojp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojp.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
