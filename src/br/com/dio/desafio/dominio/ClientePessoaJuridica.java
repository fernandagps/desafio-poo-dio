package br.com.dio.desafio.dominio;

public class ClientePessoaJuridica extends Cliente {
    protected Integer cnpj;

    public ClientePessoaJuridica() {
    }

    public ClientePessoaJuridica(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public Integer calcularDesconto() {
        return Cliente.DESCONTO_PADRAO + 30;
    }
}
