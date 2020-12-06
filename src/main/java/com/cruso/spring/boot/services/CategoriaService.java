package com.cruso.spring.boot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruso.spring.boot.domain.Categoria;
import com.cruso.spring.boot.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj;
	}
}
