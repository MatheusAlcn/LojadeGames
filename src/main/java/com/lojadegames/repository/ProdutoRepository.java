package com.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List <Produto> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
