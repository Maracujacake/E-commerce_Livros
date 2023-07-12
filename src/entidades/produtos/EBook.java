package entidades.produtos;

public class EBook extends Produto {
    private String formato;
    // Outros atributos específicos para EBook

    public EBook(String nome, String descricao, double preco, String formato) {
        super(nome, descricao, preco);
        this.formato = formato;
    }

    @Override
    public double getPreco() {
        return super.preco; // Retorna o preço definido na classe Produto
    }


    // Getters e Setters
    // ...
}