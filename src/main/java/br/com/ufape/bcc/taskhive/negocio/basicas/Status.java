package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;

    public Status(){

    }

    public Status(long id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public static void adicionarStatus(String nome, String descricao){
        Status novoStatus = new Status(nome, descricao);
    }

    //Exemplo:
    //Status.adicionarStatus(1, "Em andamento", "Tarefa em andamento.");
}

