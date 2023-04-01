package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class TarefaLista extends TarefaAbstrata {

    @OneToMany
    private List<ItemLista> subtarefas;

    public TarefaLista() {
        super();
    }

    public List<ItemLista> getSubtarefas() {
        return subtarefas;
    }

    public void setSubtarefas(List<ItemLista> subtarefas) {
        this.subtarefas = subtarefas;
    }

}
