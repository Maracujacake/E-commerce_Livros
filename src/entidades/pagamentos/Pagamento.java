package entidades.pagamentos;

public class Pagamento {
    private double valor;
    private DetalhesPagamento detalhesPagamento;

    public Pagamento(double valor, DetalhesPagamento detalhesPagamento) {
        this.valor = valor;
        this.detalhesPagamento = detalhesPagamento;
    }
    
    public void setDetalhesPagamento(DetalhesPagamento detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }


    // Implemente os getters e setters para acessar e modificar os atributos
    // ...

    // Outros métodos relacionados ao pagamento
    // ...
}