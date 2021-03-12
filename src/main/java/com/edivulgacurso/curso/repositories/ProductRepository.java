package com.edivulgacurso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edivulgacurso.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
