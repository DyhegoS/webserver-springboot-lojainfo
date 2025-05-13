package com.dhoinformatica.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhoinformatica.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
