package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Tarefa extends TarefaAbstrata {
    private String descricao;

    public Tarefa() {
    }

    public Tarefa(String titulo, Date data_prevista, String descricao) {
        super(titulo, data_prevista);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
