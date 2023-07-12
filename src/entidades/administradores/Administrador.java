package entidades.administradores;

import entidades.produtos.Produto;
import sistema.Estoque;

public class Administrador {
    private String nome;
    private String email;
    private String senha;

    public Administrador(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void adicionarProdutoAoEstoque(Estoque estoque, Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    public void removerProdutoDoEstoque(Estoque estoque, Produto produto, int quantidade) {
        estoque.removerProduto(produto, quantidade);
    }

    // Outros métodos relacionados às funcionalidades do administrador
    // ...
}