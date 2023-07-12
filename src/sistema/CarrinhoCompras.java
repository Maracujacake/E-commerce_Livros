package sistema;

import java.util.ArrayList;
import java.util.List;

import entidades.produtos.Produto;

public class CarrinhoCompras {
    private List<Produto> produtos;

    public CarrinhoCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    // Outros métodos relacionados ao carrinho de compras
    // ...
}
