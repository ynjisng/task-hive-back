package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Lembrete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private Date data;

    //Construtor vazio
    public Lembrete(){

    }

    public Lembrete(String titulo){
        this.titulo = titulo;
    }

    public Lembrete(Long id, String titulo, Date data){
        this.id = id;
        this.titulo = titulo;
        this.data = data;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Date getdate(){
        return data;
    }

    public void setDate(Date data){
        this.data = data;
    }
}
