package br.com.ufape.bcc.taskhive.negocio.cadastro;

public class TarefaNaoExiste extends Exception {

    public TarefaNaoExiste() {
        super("Tarefa não encontrada!");
    }
    
}
