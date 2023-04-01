package br.com.ufape.bcc.taskhive.negocio.cadastro;

public class UsuarioNaoExisteException extends Exception {
    public UsuarioNaoExisteException() {
        super("Usuario nao cadastrado!");
    }
    
}
