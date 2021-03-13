package com.edivulgacurso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edivulgacurso.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
