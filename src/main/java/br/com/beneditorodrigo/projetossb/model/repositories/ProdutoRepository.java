package br.com.beneditorodrigo.projetossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.beneditorodrigo.projetossb.model.entities.Produto;

public interface ProdutoRepository
	extends PagingAndSortingRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContaining(String parteNome);
}
