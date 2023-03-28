package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class TarefaAbstrata {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String titulo;
	private String prioriade;

	//private Categoria categoria;
	//private Comentario comentario;
	//private Lembrete lembrete;
	//private Usuario user;
	//private Projeto projeto;

	private Date data_criacao;
	private Date data_conclusao;
	private Date data_prevista;

	private boolean arquivado;
	private boolean excluido;
	
	public TarefaAbstrata() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPrioriade() {
		return prioriade;
	}

	public void setPrioriade(String prioriade) {
		this.prioriade = prioriade;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Date getData_conclusao() {
		return data_conclusao;
	}

	public void setData_conclusao(Date data_conclusao) {
		this.data_conclusao = data_conclusao;
	}

	public Date getData_prevista() {
		return data_prevista;
	}

	public void setData_prevista(Date data_prevista) {
		this.data_prevista = data_prevista;
	}

	public boolean isArquivado() {
		return arquivado;
	}

	public void setArquivado(boolean arquivado) {
		this.arquivado = arquivado;
	}

	public boolean isExcluido() {
		return excluido;
	}

	public void setExcluido(boolean excluido) {
		this.excluido = excluido;
	}

}
