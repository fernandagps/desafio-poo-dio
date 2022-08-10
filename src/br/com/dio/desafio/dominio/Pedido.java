package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date data;
    private Integer quantidade;
    private Double valorPedido;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido() {
    }

    private List<Produto> produtos = new ArrayList<Produto>();

    public Pedido(Date data) {
        this.data = data;
    }

    public Pedido(Date data, Integer quantidade, Double valorPedido, ArrayList<Produto> produtos) {
        this.data = data;
        this.quantidade = quantidade;
        this.valorPedido = valorPedido;
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "data=" + data +
                ", quantidade=" + quantidade +
                ", valorPedido=" + valorPedido +
                ", cliente=" + cliente +
                ", produtos=" + produtos +
                '}';
    }
}
