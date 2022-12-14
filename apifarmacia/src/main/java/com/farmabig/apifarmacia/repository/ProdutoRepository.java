package com.farmabig.apifarmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.farmabig.apifarmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase (@Param("nomeProduto")String nomeProduto);

	public List<Produto> findAllByFabricanteContainingIgnoreCase(@Param("fabricante")String fabricante);
	
	public List<Produto> findAllByPrecoBetween(@Param ("inicio") BigDecimal inicio, @Param ("fim") BigDecimal fim);

	}

