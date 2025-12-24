package com.projetojp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojp.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	

}
