package com.dhoinformatica.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhoinformatica.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
