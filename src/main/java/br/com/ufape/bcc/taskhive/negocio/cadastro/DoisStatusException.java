package br.com.ufape.bcc.taskhive.negocio.cadastro;

public class DoisStatusException extends Exception {
    public DoisStatusException(){
        super("Status ja existe!");
    }
}
