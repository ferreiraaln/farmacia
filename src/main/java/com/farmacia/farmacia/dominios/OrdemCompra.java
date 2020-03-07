package com.farmacia.farmacia.dominios;

import javax.persistence.*;

@Entity
@Table(name = "ordem_compra")
public class OrdemCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrdemCompra;


    @OneToOne
    @JoinColumn(name = "id_pedido")
    private Pedido idPedido;

    public OrdemCompra() {
    }

    public OrdemCompra(Long idOrdemCompra, Pedido idPedido) {
        this.idOrdemCompra = idOrdemCompra;
        this.idPedido = idPedido;
    }

    public Long getIdOrdemCompra() {
        return idOrdemCompra;
    }

    public void setIdOrdemCompra(Long idOrdemCompra) {
        this.idOrdemCompra = idOrdemCompra;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public String toString() {
        return "OrdemCompra{" +
                "idOrdemCompra=" + idOrdemCompra +
                ", idPedido=" + idPedido +
                '}';
    }
}
