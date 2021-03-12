package com.edivulgacurso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edivulgacurso.curso.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long> {

}
