package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;
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

    public TarefaLista(String titulo, Date data_prevista,
            List<ItemLista> subtarefas) {
        super(titulo, data_prevista);
        this.subtarefas = subtarefas;
    }

    public List<ItemLista> getSubtarefas() {
        return subtarefas;
    }

    public void setSubtarefas(List<ItemLista> subtarefas) {
        this.subtarefas = subtarefas;
    }

    public float percentualItensChecked(List<ItemLista> itens){
        float percentual = 0;
        int totalItens = itens.size();
        int totalChecked = 0;
        
        for (ItemLista item : itens) {
            if (item.isChecked()) {
                totalChecked++;
            }
        }
        
        if (totalItens > 0) {
            percentual = (float) totalChecked / totalItens * 100;
        }
        
        return percentual;
    }
    

}
