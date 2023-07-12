package entidades.pagamentos;

public class DetalhesPagamento {
    // Atributos comuns a todos os detalhes de pagamento
    private String numeroCartao;
    private String nomeTitular;
    private String codigoSeguranca;

    public DetalhesPagamento(String numeroCartao, String nomeTitular, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.codigoSeguranca = codigoSeguranca;
    }

    // Métodos getters e setters
    // ...
}

