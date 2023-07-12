package sistema;

import java.util.HashMap;
import java.util.Map;

import entidades.produtos.Produto;

public class Estoque {
    private Map<Produto, Integer> quantidadePorProduto;

    public Estoque() {
        quantidadePorProduto = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        quantidadePorProduto.put(produto, quantidade);
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (quantidadePorProduto.containsKey(produto)) {
            int quantidadeAtual = quantidadePorProduto.get(produto);
            if (quantidade <= quantidadeAtual) {
                quantidadePorProduto.put(produto, quantidadeAtual - quantidade);
            } else {
                // Tratar o caso em que a quantidade a ser removida é maior do que a quantidade disponível
                // ...
            }
        }
    }

    // Outros métodos para gerenciar o estoque
    // ...
}