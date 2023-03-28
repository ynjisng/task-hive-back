package br.com.ufape.bcc.taskhive.negocio.basicas;

public class TarefaLista extends TarefaAbstrata {
    private ItemLista subtarefa;

    public TarefaLista() {
    }

    public ItemLista getSubtarefa() {
        return subtarefa;
    }

    public void setSubtarefa(ItemLista subtarefa) {
        this.subtarefa = subtarefa;
    }

}
