package br.com.dio.desafio.dominio;

import java.util.Date;

public class Produto {
    private String nome;
    private Integer valor;
    private Date dataValidade;

    public Produto(String nome, Integer valor, Date dataValidade) {
        this.nome = nome;
        this.valor = valor;
        this.dataValidade = dataValidade;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
