package Entidades;

import Interfaces.IVendas;

public abstract class Usuario {
    private String nome;
    private String CPF;
    private String senha;
    private String endereco;
    private String email;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void consultar() {
        System.out.println(getCPF() + "\n" +
                           getEmail() + "\n" +
                           getEndereco() + "\n" +
                           getNome() + "\n" +
                           getSenha());
    }
}
