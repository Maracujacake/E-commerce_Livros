package entidades.suporte;

public class Suporte {
    private String nome;
    private String email;
    private String telefone;

    public Suporte() {
        // Construtor vazio
    }

    public Suporte(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void responderPergunta(Pergunta pergunta, String resposta) {
        pergunta.setResposta(resposta);
    }

    // Getters e Setters
    // ...

    // Outros métodos relacionados ao suporte técnico
    // ...
}