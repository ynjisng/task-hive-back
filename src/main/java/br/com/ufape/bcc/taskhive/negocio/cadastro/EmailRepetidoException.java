package br.com.ufape.bcc.taskhive.negocio.cadastro;

public class EmailRepetidoException extends Exception {
    public EmailRepetidoException() {
        super("O usuario ja existe!");
    }
}
