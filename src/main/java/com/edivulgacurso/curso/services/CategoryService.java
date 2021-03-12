package com.edivulgacurso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edivulgacurso.curso.entities.Category;
import com.edivulgacurso.curso.repositories.CategoryRespository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRespository categoryRepository;

	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}
