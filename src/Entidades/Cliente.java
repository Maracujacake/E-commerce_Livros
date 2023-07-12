package Entidades;

import Entidades.Produtos.Estoque_Consulta;
import Interfaces.ICliente;

public class Cliente extends Usuario implements ICliente {
    private int idCliente;

    public Cliente() {

    }

    public Cliente(String nome, String CPF, String senha, String endereco, String email, int idCliente) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setSenha(senha);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void consultarLivro(Estoque_Consulta consulta) {
        consulta.printarLivros();
    }
}
