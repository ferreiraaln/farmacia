package com.farmacia.farmacia.controllers;

import com.farmacia.farmacia.dominios.OrdemCompra;
import com.farmacia.farmacia.dominios.Produto;
import com.farmacia.farmacia.services.OrdemCompraService;
import com.farmacia.farmacia.services.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto-create")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Produto produto) {
        produtoService.save(produto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
