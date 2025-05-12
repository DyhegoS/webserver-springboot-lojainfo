package com.dhoinformatica.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhoinformatica.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
