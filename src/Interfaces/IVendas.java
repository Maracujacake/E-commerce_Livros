package Interfaces;

import Entidades.Produtos.EBook;
import Entidades.Produtos.Estoque_Consulta;
import Entidades.Produtos.LivroFis;

public interface IVendas {
    Estoque_Consulta adicionarLivro(Estoque_Consulta consultaEstoque, LivroFis livroFis);
    Estoque_Consulta adicionarEBook(Estoque_Consulta consultaEstoque, EBook eBook);
}
