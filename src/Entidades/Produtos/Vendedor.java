package Entidades.Produtos;

import Entidades.Usuario;
import Interfaces.IVendas;

public class Vendedor extends Usuario implements IVendas {
    private int idVendedor;

    public Vendedor(String nome, String CPF, String senha, String endereco, String email, int idVendedor) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setSenha(senha);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.idVendedor = idVendedor;
    }

    public Estoque_Consulta adicionarLivro(Estoque_Consulta consultaEstoque, LivroFis livroFis) {
        consultaEstoque.adicionarLivro(livroFis);
        return consultaEstoque;
    }

    public Estoque_Consulta adicionarEBook(Estoque_Consulta consultaEstoque, EBook eBook) {
        consultaEstoque.adicionarEBook(eBook);
        return consultaEstoque;
    }
}
