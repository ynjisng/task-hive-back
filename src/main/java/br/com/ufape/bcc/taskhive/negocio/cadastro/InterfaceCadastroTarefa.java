package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

public interface InterfaceCadastroTarefa {
	
    Tarefa procurarTarefa(String titulo) throws TarefaNaoExisteException;

    Tarefa procurarTarefaId(Long id) throws TarefaNaoExisteException;

	List<Tarefa> listarTarefas();

	Tarefa listarTarefasUsuario(Usuario user);

	void deletarTarefaId(Long id);

	Tarefa salvarTarefa(Tarefa entity);

	void deletarTarefa(Tarefa tarefa);
}
