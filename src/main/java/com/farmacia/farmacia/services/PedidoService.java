package com.farmacia.farmacia.services;

import com.farmacia.farmacia.dominios.Pedido;
import com.farmacia.farmacia.dominios.PedidoProduto;
import com.farmacia.farmacia.dominios.Produto;
import com.farmacia.farmacia.repository.PedidoProdutoRepository;
import com.farmacia.farmacia.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private PedidoRepository pedidoRepository;
    private PedidoProdutoRepository pedidoProdutoRepository;

    public PedidoService(PedidoRepository pedidoRepository, PedidoProdutoRepository pedidoProdutoRepository) {
        this.pedidoRepository = pedidoRepository;
        this.pedidoProdutoRepository = pedidoProdutoRepository;
    }

    public void save(Pedido pedido, Produto produto, Integer quantidade){
        Pedido pedidoSalvo = pedidoRepository.save(pedido);

        //falta corrigir esta parte..
        PedidoProduto pedidoProduto = new PedidoProduto(pedidoSalvo, produto,quantidade);
        pedidoProdutoRepository.save(pedidoProduto);
    }
}
