package entidades.produtos;

public class LivroFisico extends Produto {
    private String autor;
    private String editora;
    // Outros atributos específicos para LivroFisico

    public LivroFisico(String nome, String descricao, double preco, String autor, String editora) {
        super(nome, descricao, preco);
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public double getPreco() {
        return super.preco; // Retorna o preço definido na classe Produto
    }

    // Getters e Setters
    // ...
}