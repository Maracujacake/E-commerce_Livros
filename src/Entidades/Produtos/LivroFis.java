package Entidades.Produtos;

import Entidades.Produtos.Book;

public class LivroFis extends Book {
    private String edicao;

    public LivroFis(String nome) {
        this.setNome(nome);
    }

    public LivroFis(String nome, String autor, String genero, String sinopse, String editora, float preco, String idioma, String edicao) {
        this.setNome(nome);
        this.setAutor(autor);
        this.setGenero(genero);
        this.setSinopse(sinopse);
        this.setEditora(editora);
        this.setPreco(preco);
        this.setIdioma(idioma);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
}

