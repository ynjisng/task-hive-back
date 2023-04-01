package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class TarefaAbstrata {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String prioridade;

	//private Categoria categoria;
	//private Comentario comentario;
	//private Lembrete lembrete;
	//private Usuario user;
	//private Projeto projeto;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data_criacao;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data_conclusao;

	@JsonFormat(pattern="dd/MM/yyyy")
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

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		Date dataHoraAtual = new Date();
		this.data_criacao = dataHoraAtual;
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
