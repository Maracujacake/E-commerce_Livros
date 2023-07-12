package Entidades.Produtos;

import Entidades.Produtos.EBook;
import Entidades.Produtos.LivroFis;

import java.util.ArrayList;
import java.util.List;

public class Estoque_Consulta {
    private List<LivroFis> listaLivroFis = new ArrayList<>();
    private List<EBook> listaEBook = new ArrayList<>();

    public List<LivroFis> getListaLivros() {
        return listaLivroFis;
    }
    public List<EBook> getListaEBook() {
        return listaEBook;
    }

    public void printarLivros() {
        for(LivroFis livroFis : listaLivroFis) {
            System.out.println("Livro: " + livroFis.getNome());
        }

        for(EBook eBook : listaEBook) {
            System.out.println("eBook: " + eBook.getNome());
        }
    }

    //trocar para protected
    protected void adicionarLivro(LivroFis livroFis) {
        listaLivroFis.add(livroFis);
    }
    protected void adicionarEBook(EBook eBook) {
        listaEBook.add(eBook);
    }
}
