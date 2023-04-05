package br.com.ufape.bcc.taskhive.negocio.cadastro;

public class UsuarioSemTarefaException extends Exception {

    public UsuarioSemTarefaException() {
        super("Tarefas não encontradas para esse usuário!");
    }
    
}
