package br.com.ufape.bcc.taskhive.negocio.cadastro;

public class ProjetoJaExisteException extends Exception {
    public ProjetoJaExisteException() {
        super("Projeto ja existe!");
    }
}
