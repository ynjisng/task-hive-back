package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

public interface InterfaceCadastroTarefa {
	
    Tarefa procurarTarefa(String titulo) throws TarefaNaoExisteException;

    Tarefa procurarTarefaId(Long id) throws TarefaNaoExisteException;

	List<Tarefa> listarTarefas();

	List<Tarefa> listarTarefasUsuario();

	void deletarTarefaId(Long id);

	void salvarTarefa(Tarefa entity);

	void deletarTarefa(Tarefa tarefa);
}
