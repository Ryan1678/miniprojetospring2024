package br.com.itb.miniprojetospring.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository 
	extends JpaRepository<Produto, Long> {

	Produto findAllById(long id);
}
