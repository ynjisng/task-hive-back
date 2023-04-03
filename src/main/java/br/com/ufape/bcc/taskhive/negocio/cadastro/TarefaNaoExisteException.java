package br.com.ufape.bcc.taskhive.negocio.cadastro;

public class TarefaNaoExisteException extends Exception {

    public TarefaNaoExisteException() {
        super("Tarefa não encontrada!");
    }
    
}
