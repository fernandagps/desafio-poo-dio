package br.com.dio.desafio.dominio;

import java.util.Date;

public class ClientePessoaFisica extends Cliente {
    protected Integer idade;
    protected String sexo;

    public ClientePessoaFisica() {
    }

    public ClientePessoaFisica(Integer idade, String sexo) {
        super();
        this.idade = idade;
        this.sexo = sexo;
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

    protected void setIdade(Integer idade) {
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
