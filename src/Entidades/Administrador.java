package Entidades;

public class Administrador extends Usuario {
    private int idAdmin;

    public Administrador(String nome, String CPF, String senha, String endereco, String email, int idAdmin) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setSenha(senha);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.idAdmin = idAdmin;
    }

    /* Funções que ainda serão melhor implementadas
    public void gerenciarUsuarios() {
        System.out.println("Gerenciando usuários...");
    }
    
    public void consultarEstatisticas() {
    	System.out.println("Consultando estatisticas...");
    }
    */
}
