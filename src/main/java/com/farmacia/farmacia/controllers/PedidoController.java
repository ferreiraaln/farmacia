package com.farmacia.farmacia.controllers;

import com.farmacia.farmacia.dominios.Pedido;
import com.farmacia.farmacia.dominios.Produto;
import com.farmacia.farmacia.services.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido-create")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Pedido pedido, Produto produto){
        pedidoService.save(pedido,produto, 3);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
