package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegistroStatus {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private TarefaAbstrata tarefa;

	private Date data_registro;

	//private Status status;

	public RegistroStatus() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TarefaAbstrata getTarefa() {
		return tarefa;
	}

	public void setTarefa(TarefaAbstrata tarefa) {
		this.tarefa = tarefa;
	}

	public Date getData_registro() {
		return data_registro;
	}

	public void setData_registro(Date data_registro) {
		this.data_registro = data_registro;
	}
	
}
