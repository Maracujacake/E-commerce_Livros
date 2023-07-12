package entidades.produtos;

public abstract class Produto {
    private String nome;
    private String descricao;
    protected double preco;

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

	public abstract double getPreco();

    // Getters e Setters
    // ...
}