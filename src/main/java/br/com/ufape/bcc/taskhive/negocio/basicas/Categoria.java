package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Id;

public class Categoria {
    @Id
    private long id;

    //Construtor vazio
    public Categoria(){

    }

    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public adicionarCategoria(){

    }
    
    public atualizarCategoria(){

    }
}
