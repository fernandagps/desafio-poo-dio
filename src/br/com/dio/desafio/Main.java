package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new ClientePessoaFisica();
        cliente1.setNome("Fernanda Paiola");
        cliente1.setEndereco("Rua sao paulo, numero 1000");
        cliente1.setAtivo(true);


        Cliente cliente2 = new ClientePessoaJuridica();
        cliente2.setNome("Paiola Construcoes");
        cliente2.setEndereco("Rua america, numero 300");


        Produto produto1 = new Produto();
        produto1.setNome("Notebook");
        produto1.setValor(1000);


        Pedido pedido1 = new Pedido();
        pedido1.setProdutos(Arrays.asList(produto1));
        pedido1.setValorPedido(1000.0);
        pedido1.setQuantidade(2);


        System.out.println(pedido1);


    }
}
