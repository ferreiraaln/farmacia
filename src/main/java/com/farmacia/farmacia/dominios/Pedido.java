package com.farmacia.farmacia.dominios;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPedido;

    @OneToMany(mappedBy = "pedido")
    private List<PedidoProduto> pedidoProdutoList;

    private String origemPedido;
    private Date dataPedido;

    public Pedido() {
    }

    public Pedido(Long idPedido, List<PedidoProduto> pedidoProdutoList, String origemPedido, Date dataPedido) {
        this.idPedido = idPedido;
        this.pedidoProdutoList = pedidoProdutoList;
        this.origemPedido = origemPedido;
        this.dataPedido = dataPedido;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public List<PedidoProduto> getPedidoProdutoList() {
        return pedidoProdutoList;
    }

    public void setPedidoProdutoList(List<PedidoProduto> pedidoProdutoList) {
        this.pedidoProdutoList = pedidoProdutoList;
    }

    public String getOrigemPedido() {
        return origemPedido;
    }

    public void setOrigemPedido(String origemPedido) {
        this.origemPedido = origemPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", pedidoProdutoList=" + pedidoProdutoList +
                ", origemPedido='" + origemPedido + '\'' +
                ", dataPedido=" + dataPedido +
                '}';
    }
}
