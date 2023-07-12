package entidades.vendedores;

import entidades.produtos.Produto;
import sistema.Estoque;

public class Vendedor {
    private Estoque estoque;

    public Vendedor() {
        estoque = new Estoque();
    }

    public void adicionarProdutoAoEstoque(Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    public void removerProdutoDoEstoque(Produto produto, int quantidade) {
        estoque.removerProduto(produto, quantidade);
    }

    // Outros métodos relacionados ao vendedor
    // ...
}