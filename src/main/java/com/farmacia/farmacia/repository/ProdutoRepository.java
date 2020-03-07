package com.farmacia.farmacia.repository;

import com.farmacia.farmacia.dominios.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
