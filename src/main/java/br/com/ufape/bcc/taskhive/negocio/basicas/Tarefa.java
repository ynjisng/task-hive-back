package br.com.ufape.bcc.taskhive.negocio.basicas;

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
