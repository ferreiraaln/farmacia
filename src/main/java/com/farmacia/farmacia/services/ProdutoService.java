package com.farmacia.farmacia.services;

import com.farmacia.farmacia.dominios.OrdemCompra;
import com.farmacia.farmacia.dominios.Produto;
import com.farmacia.farmacia.repository.OrdemCompraRepository;
import com.farmacia.farmacia.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void save(Produto produto){
        produtoRepository.save(produto);
    }

}
