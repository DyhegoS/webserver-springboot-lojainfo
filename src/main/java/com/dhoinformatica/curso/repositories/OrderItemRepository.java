package com.dhoinformatica.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhoinformatica.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
