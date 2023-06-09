package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private List<String> subcategorias;

    public Categoria(String nome){
        this.nome = nome;
    }

    public Categoria(String nome, long id){
        this.id = id;
        this.nome = nome;
        this.subcategorias = new ArrayList<String>();
    }

    public Categoria(){
    }

    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<String> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<String> subcategorias) {
        this.subcategorias = subcategorias;
    }

}
