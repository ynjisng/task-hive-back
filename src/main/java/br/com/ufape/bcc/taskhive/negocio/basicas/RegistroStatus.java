package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class RegistroStatus {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany
	private List<TarefaAbstrata> tarefa;

	private Date data_registro;

	//private Status status;

	public RegistroStatus() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<TarefaAbstrata> getTarefa() {
		return tarefa;
	}

	public void setTarefa(List<TarefaAbstrata> tarefa) {
		this.tarefa = tarefa;
	}

	public Date getData_registro() {
		return data_registro;
	}

	public void setData_registro(Date data_registro) {
		this.data_registro = data_registro;
	}

	
	
}
