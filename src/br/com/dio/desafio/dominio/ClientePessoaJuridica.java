package br.com.dio.desafio.dominio;

public class ClientePessoaJuridica extends Cliente {
    protected String cnpj;

    public ClientePessoaJuridica() {
    }

    public ClientePessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public Integer calcularDesconto() {
        return Cliente.DESCONTO_PADRAO + 30;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
