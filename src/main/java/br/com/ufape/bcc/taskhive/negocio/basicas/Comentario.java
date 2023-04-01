package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mensagem;

    public Comentario(long id, String mensagem){
        this.id = id;
        this.mensagem = mensagem;
    }

    //Construtor vazio
    public Comentario(){

    }

    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public String getMensagem(){
        return mensagem;
    }

    public void setMensagem(){
        this.mensagem = mensagem;
    }

    public void adicionarComentario(String novaMensagem){
        Comentario novoComentario = new Comentario(novaMensagem);

        //Adiciona o novo comentário à lista de comentários
        listaDeComentarios.add(novoComentario);
    }
    
    //Como chamar:
    //Comentário meuComentario = new Comentário("Lucas", "Ótimo artigo!");
    //meuComentario.adicionarComentario("Sara", "Concordo com você, Lucas.");

    public void atualizarComentario(String novaMensagem){
        this.mensagem = mensagem;
    }

    //Como chamar:
    //Comentário meuComentario = new Comentário("João", "Ótimo artigo!");
    //meuComentario.atualizarComentario("Gostei bastante, parabéns!");

}

