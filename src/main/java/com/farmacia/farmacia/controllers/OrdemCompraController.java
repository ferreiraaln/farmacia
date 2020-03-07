package com.farmacia.farmacia.controllers;


import com.farmacia.farmacia.dominios.OrdemCompra;
import com.farmacia.farmacia.services.OrdemCompraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordemcompra")
public class OrdemCompraController {

    private OrdemCompraService ordemCompraService;

    public OrdemCompraController(OrdemCompraService ordemCompraService) {
        this.ordemCompraService = ordemCompraService;
    }

    @GetMapping
    public ResponseEntity teste() {
        return ResponseEntity.status(HttpStatus.OK).body(ordemCompraService.teste());
    }

    @PostMapping
    public ResponseEntity create(@RequestBody OrdemCompra ordemCompra) {
        //ordemCompraService.save(ordemCompra);
        return ResponseEntity.status(HttpStatus.OK).body("em manutenção");
    }
}
