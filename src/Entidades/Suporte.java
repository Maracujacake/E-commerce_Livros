package Entidades;

import Entidades.Pergunta;
import Entidades.Usuario;
import Interfaces.ISuporte;

import java.util.Scanner;

public class Suporte extends Usuario implements ISuporte {
    private int idSuporte;

    public Suporte (){

    }

    public Suporte(String nome, String CPF, String senha, String endereco, String email, int idSuporte) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setSenha(senha);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.idSuporte = idSuporte;
    }

    public Pergunta responderPergunta(Pergunta pergunta) {
    	System.out.println("Digite sua resposta a pergunta: ");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        pergunta.setResposta("Resposta do suporte: " + resposta);
        return pergunta;
    }
    
    /*
     public void consultarAtendimento(){
     	System.out.println("consultando atendimentos...")
     }
     */
}
