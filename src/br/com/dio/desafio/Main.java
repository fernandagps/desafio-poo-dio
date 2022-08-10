package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new ClientePessoaFisica(28, "fem");
        cliente1.setNome("Fernanda Paiola");
        cliente1.setEndereco("Rua sao paulo, numero 1000");
        cliente1.setAtivo(true);
        cliente1.calcularDesconto();

        System.out.println(cliente1);


        Cliente cliente2 = new ClientePessoaJuridica("0000000/0000");
        cliente2.setNome("Paiola Construcoes");
        cliente2.setEndereco("Rua america, numero 300");
        cliente2.calcularDesconto();

        System.out.println(cliente2);


        Produto produto1 = new Produto();
        produto1.setNome("Notebook");
        produto1.setValor(1000);

        System.out.println(produto1);

        Pedido pedido1 = new Pedido();
        pedido1.setProdutos(Arrays.asList(produto1));
        pedido1.setValorPedido(1000.0);
        pedido1.setQuantidade(2);
        pedido1.setCliente(cliente1);

        System.out.println(pedido1);


    }
}
