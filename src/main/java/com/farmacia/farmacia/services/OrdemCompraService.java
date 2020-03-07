package com.farmacia.farmacia.services;

import com.farmacia.farmacia.dominios.OrdemCompra;
import com.farmacia.farmacia.repository.OrdemCompraRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdemCompraService {

   private OrdemCompraRepository ordemCompraRepository;

    public OrdemCompraService(OrdemCompraRepository ordemCompraRepository) {
        this.ordemCompraRepository = ordemCompraRepository;
    }

    public String teste(){
        return "oi";
    }

    public void save(OrdemCompra ordemCompra){
        ordemCompraRepository.save(ordemCompra);
    }
}
