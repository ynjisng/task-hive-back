package br.com.ufape.bcc.taskhive.negocio.basicas;

public class DataPrevistaIncorreta extends Exception {
	public DataPrevistaIncorreta() {
		super("Data Prevista anterior a Data de hoje!");
	}
}
