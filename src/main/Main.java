package main;

import entidades.produtos.*;
import entidades.clientes.*;
import entidades.pedidos.*;
import entidades.vendedores.*;
import entidades.suporte.Suporte;
import entidades.administradores.Administrador;
import entidades.pagamentos.*;

import interfaces.EstoqueAdicionavel;
import sistema.Estoque;
import sistema.CarrinhoCompras;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        Cliente cliente = new Cliente("João", "Rua A, 123", "joao@email");

        LivroFisico livroFisico1 = new LivroFisico("As Crônicas de Nárnia", "Fantasia", 29.99, "C.S. Lewis", "Editora X");
        EBook eBook1 = new EBook("Revolução dos Bixos", "Política", 19.99, "PDF");
        EBook eBook2 = new EBook("Noites Brancas", "Romance", 29.99, "PDF");

        vendedor.adicionarProdutoAoEstoque(livroFisico1, 10);
        vendedor.adicionarProdutoAoEstoque(eBook1, 5);
        vendedor.adicionarProdutoAoEstoque(eBook2, 12);
        
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarProduto(livroFisico1);
        carrinho.adicionarProduto(eBook1);
        carrinho.adicionarProduto(eBook2);

        double total = carrinho.calcularTotal();
        System.out.println("Total do carrinho: R$ " + total);

        Suporte suporte = new Suporte();
        // Utilize os métodos da classe Suporte conforme necessário

        Administrador administrador = new Administrador(null, null, null);
        // Utilize os métodos da classe Administrador conforme necessário

        MetodoPagamento metodoPagamento = MetodoPagamento.DEBITO;
        DetalhesPagamento detalhesPagamento = new DetalhesPagamentoDebito("1234567890", "João", "123");
        Pagamento pagamento = new Pagamento(total, detalhesPagamento);

        switch (metodoPagamento) {
            case DEBITO:
                detalhesPagamento = new DetalhesPagamentoDebito("1234567890", "João", "123");
                break;
            case CREDITO:
                detalhesPagamento = new DetalhesPagamentoCredito("1234567890", "João", "123", "12/23");
                break;
            case PIX:
                detalhesPagamento = new DetalhesPagamentoPix("chavePix");
                break;
            default:
                System.out.println("Método de pagamento não suportado");
                return;
        }

        pagamento.setDetalhesPagamento(detalhesPagamento);
        // Realize as operações de pagamento conforme necessário
    }
}
