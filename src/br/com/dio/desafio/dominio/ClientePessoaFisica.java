package br.com.dio.desafio.dominio;

import java.util.Date;

public class ClientePessoaFisica extends Cliente {
    private Integer idade;
    private String sexo;

    public ClientePessoaFisica() {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                '}';
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public Integer calcularDesconto() {
        return Cliente.DESCONTO_PADRAO + 5;
    }
}
