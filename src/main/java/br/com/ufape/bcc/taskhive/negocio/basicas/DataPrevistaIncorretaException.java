package br.com.ufape.bcc.taskhive.negocio.basicas;

public class DataPrevistaIncorretaException extends Exception {
	public DataPrevistaIncorretaException() {
		super("Data Prevista anterior a Data de hoje!");
	}
}
