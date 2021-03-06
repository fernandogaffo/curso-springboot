package com.edivulgacurso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edivulgacurso.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
