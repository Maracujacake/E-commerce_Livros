package entidades.suporte;

public class Pergunta {
    private int id;
    private String descricao;
    private String resposta;

    public Pergunta(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.resposta = null; // Inicialmente sem resposta
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}