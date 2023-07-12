package entidades.pedidos;

import entidades.clientes.Cliente;
import entidades.produtos.Produto;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private String enderecoEntrega;
    // Outros atributos do pedido

    public Pedido(Cliente cliente, List<Produto> produtos, String enderecoEntrega) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.enderecoEntrega = enderecoEntrega;
    }

    // Getters e Setters
    // ...
}