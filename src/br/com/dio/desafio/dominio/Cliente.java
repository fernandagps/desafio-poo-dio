package br.com.dio.desafio.dominio;

public abstract class Cliente {
    private  String nome;
    private String endereco;
    protected static  final int DESCONTO_PADRAO = 10;
    private boolean ativo;

    public boolean isAtivo() {
        return ativo;
    }

    public abstract Integer calcularDesconto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
