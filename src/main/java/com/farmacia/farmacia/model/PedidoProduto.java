package com.farmacia.farmacia.model;

import javax.persistence.*;

@Entity
@Table(name = "pedido_produto")
public class PedidoProduto {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long idPedidoProduto;

        @ManyToOne
        @JoinColumn(name = "id_pedido")
        private Pedido pedido;

        @OneToOne
        @JoinColumn(name = "id_produto")
        private Produto produto;

        private Integer quantidadePedido;

        public PedidoProduto() {
        }

        public PedidoProduto(Long idPedidoProduto, Pedido pedido, Produto produto, Integer quantidadePedido) {
                this.idPedidoProduto = idPedidoProduto;
                this.pedido = pedido;
                this.produto = produto;
                this.quantidadePedido = quantidadePedido;
        }

        public Long getIdPedidoProduto() {
                return idPedidoProduto;
        }

        public void setIdPedidoProduto(Long idPedidoProduto) {
                this.idPedidoProduto = idPedidoProduto;
        }

        public Pedido getPedido() {
                return pedido;
        }

        public void setPedido(Pedido pedido) {
                this.pedido = pedido;
        }

        public Produto getProduto() {
                return produto;
        }

        public void setProduto(Produto produto) {
                this.produto = produto;
        }

        public Integer getQuantidadePedido() {
                return quantidadePedido;
        }

        public void setQuantidadePedido(Integer quantidadePedido) {
                this.quantidadePedido = quantidadePedido;
        }

        @Override
        public String toString() {
                return "PedidoProduto{" +
                        "idPedidoProduto=" + idPedidoProduto +
                        ", pedido=" + pedido +
                        ", produto=" + produto +
                        ", quantidadePedido=" + quantidadePedido +
                        '}';
        }
}
