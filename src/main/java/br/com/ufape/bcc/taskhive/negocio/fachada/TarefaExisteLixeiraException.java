package br.com.ufape.bcc.taskhive.negocio.fachada;

public class TarefaExisteLixeiraException extends Exception {

    public TarefaExisteLixeiraException() {
        super("Tarefas já se encontra na lixeira!");
    }
    
}
