package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Entity;

@Entity
public class Tarefa extends TarefaAbstrata {
    private String descricao;

    public Tarefa() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
