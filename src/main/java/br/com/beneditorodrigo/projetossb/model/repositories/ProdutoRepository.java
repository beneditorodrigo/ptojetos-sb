package br.com.beneditorodrigo.projetossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.beneditorodrigo.projetossb.model.entities.Produto;

public interface ProdutoRepository
	extends CrudRepository<Produto, Integer>{

	
}
