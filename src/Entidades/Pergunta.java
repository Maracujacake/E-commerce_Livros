package Entidades;

public class Pergunta {
    private int idCliente;
    private int idPergunta;
    private String tema;
    private String titulo;
    private String descricao;
    private String resposta;

    public Pergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }

    public Pergunta(int idCliente, int idPergunta, String tema, String titulo, String descricao) {
        this.idCliente = idCliente;
        this.idPergunta = idPergunta;
        this.tema = tema;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getIdPergunta() {
        return idPergunta;
    }
    public void setIdPergunta(int idCliente) {
        this.idPergunta = idPergunta;
    }

    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResposta() {
        return resposta;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
