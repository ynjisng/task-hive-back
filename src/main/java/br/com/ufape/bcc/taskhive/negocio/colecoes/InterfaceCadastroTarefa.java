package br.com.ufape.bcc.taskhive.negocio.colecoes;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaAbstrata;

public interface InterfaceCadastroTarefa {
    List<TarefaAbstrata> procurarTarefa(String titulo);

    TarefaAbstrata procurarTarefaId(long id);

	List<TarefaAbstrata> listarTarefas();

	List<TarefaAbstrata> listarTarefasUsuario();

	void deletarTarefaId(Long id);

	TarefaAbstrata salvarTarefa(TarefaAbstrata entity);

	void deletarTarefa(TarefaAbstrata tarefa);
}
