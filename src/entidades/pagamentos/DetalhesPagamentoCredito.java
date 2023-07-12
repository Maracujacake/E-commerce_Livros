package entidades.pagamentos;

public class DetalhesPagamentoCredito extends DetalhesPagamento {
    private String dataExpiracao;

    public DetalhesPagamentoCredito(String numeroCartao, String nomeTitular, String codigoSeguranca, String dataExpiracao) {
        super(numeroCartao, nomeTitular, codigoSeguranca);
        this.dataExpiracao = dataExpiracao;
    }

    // Implemente os getters e setters para acessar e modificar o atributo 'dataExpiracao'
    // ...

    // Outros métodos relacionados aos detalhes do pagamento com cartão de crédito
    // ...
}
