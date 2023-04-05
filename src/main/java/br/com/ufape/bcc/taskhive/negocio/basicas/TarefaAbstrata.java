package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public abstract class TarefaAbstrata {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String prioridade;

	@ManyToOne
	private Categoria categoria;

	@OneToMany
	private List<Comentario> comentario;

	@ManyToOne
	private Lembrete lembrete;

	@OneToMany
	private List<Usuario> user;
	
	@ManyToOne
	private Projeto projeto;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data_criacao;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data_conclusao;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data_prevista;

	private boolean arquivado;
	private boolean excluido;

	public TarefaAbstrata(String titulo, Date data_prevista) {
		this.titulo = titulo;
		this.data_criacao = new Date();
		this.data_prevista = data_prevista;
		this.arquivado = false;
		this.excluido = false;
	}

	public TarefaAbstrata() {
		this.arquivado = false;
		this.excluido = false;
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

	public void setId(Long id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}

	public Lembrete getLembrete() {
		return lembrete;
	}

	public void setLembrete(Lembrete lembrete) {
		this.lembrete = lembrete;
	}
	
	public List<Usuario> getUser() {
		return user;
	}
	
	public void setUser(List<Usuario> user) {
		this.user = user;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}
	
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	public Long gerarEstimativaTempo(Date inicio, Date previsao) throws DataPrevistaIncorreta{
		if(inicio.compareTo(previsao) > 0){
			throw new DataPrevistaIncorreta();
		}
	
		Long estimativaMilissegundos = previsao.getTime() - inicio.getTime();
		Long estimativaDias = TimeUnit.DAYS.convert(estimativaMilissegundos, TimeUnit.MILLISECONDS);
		return estimativaDias;
	}
	
}
