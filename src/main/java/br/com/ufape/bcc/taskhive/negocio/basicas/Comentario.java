package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Id;

public class Comentario {
    @Id
    private long id;

    //Construtor vazio
    public Comentario(){

    }

    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public void adicionarComentario(){

    }

    public void atualizarComentario(){

    }
}

