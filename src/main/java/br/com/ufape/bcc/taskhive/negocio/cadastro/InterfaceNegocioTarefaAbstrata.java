package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaAbstrata;

public interface InterfaceNegocioTarefaAbstrata {
	
    List<TarefaAbstrata> procurarTarefa(String titulo);

    TarefaAbstrata procurarTarefaId(long id);

	List<TarefaAbstrata> listarTarefas();

	List<TarefaAbstrata> listarTarefasUsuario();

	void deletarTarefaId(Long id);

	void salvarTarefa(TarefaAbstrata entity);

	void deletarTarefa(TarefaAbstrata tarefa);
}
