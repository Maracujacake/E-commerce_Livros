package Main;

import Entidades.*;
import Entidades.Produtos.EBook;
import Entidades.Produtos.Estoque_Consulta;
import Entidades.Produtos.LivroFis;
import Entidades.Produtos.Vendedor;
import Interfaces.*;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("", "", "", "", "", 1);
        Cliente cliente = new Cliente("", "", "", "", "", 1);

        Estoque_Consulta consulta = new Estoque_Consulta();

        LivroFis livroFis1 = new LivroFis("As crônicas de Nárnia", "", "", "", "", 1, "", "");
        LivroFis livroFis2 = new LivroFis("Percy Jackson e o ladrão de raios", "", "", "", "", 1, "", "");
        EBook eBook1 = new EBook("Revolução dos bixos");

        consulta = vendedor.adicionarLivro(consulta, livroFis1);
        consulta = vendedor.adicionarLivro(consulta, livroFis2);
        consulta = vendedor.adicionarEBook(consulta, eBook1);
        
        cliente.consultarLivro(consulta);
        Suporte suporte = new Suporte();
        
        /*
          Teste de retorno e edição de dados de usuário (get e set)
        cliente.setEmail("teste@gmail.com");
        System.out.println(cliente.getEmail());
        */
        
        
        //Pergunta pergunta1 = new Pergunta(1);
        //pergunta1.setDescricao("Quanto custa livro X?");
        
        
        // resposta do suporte a pergunta
        //System.out.println(pergunta1.getDescricao());
        //suporte.responderPergunta(pergunta1);
        //System.out.println(pergunta1.getResposta());

    }
}