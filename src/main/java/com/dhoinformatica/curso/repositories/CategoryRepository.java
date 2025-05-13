package com.dhoinformatica.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhoinformatica.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
