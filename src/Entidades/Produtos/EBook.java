package Entidades.Produtos;

import Entidades.Produtos.Book;

public class EBook extends Book {
    private boolean disponivel;

    public EBook(String nome) {
        this.setNome(nome);
    }

    public EBook(String nome, String autor, String genero, String sinopse, String editora, float preco, String idioma) {
        this.setNome(nome);
        this.setAutor(autor);
        this.setGenero(genero);
        this.setSinopse(sinopse);
        this.setEditora(editora);
        this.setPreco(preco);
        this.setIdioma(idioma);
    }

    public boolean getEdicao() {
        return disponivel;
    }
    public void setEdicao(boolean edicao) {
        this.disponivel = disponivel;
    }
}
