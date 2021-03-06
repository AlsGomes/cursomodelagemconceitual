package com.als.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.als.curso.domain.Produto;
import com.als.curso.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public Produto findById(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
