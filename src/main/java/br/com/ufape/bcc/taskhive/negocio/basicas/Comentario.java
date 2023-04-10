package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mensagem;

    public Comentario(){
    }

    public Comentario(long id, String mensagem){
        this.id = id;
        this.mensagem = mensagem;
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

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

}

