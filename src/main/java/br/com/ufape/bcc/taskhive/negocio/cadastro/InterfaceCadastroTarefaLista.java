package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

public interface InterfaceCadastroTarefaLista {
	
    TarefaLista procurarTarefa(String titulo) throws TarefaNaoExisteException;

    TarefaLista procurarTarefaId(Long id) throws TarefaNaoExisteException;

	List<TarefaLista> listarTarefas();

	List<TarefaLista> listarTarefasUsuario(Usuario user) throws UsuarioSemTarefaException;

	void deletarTarefaId(Long id);

	void salvarTarefa(TarefaLista entity);

	void deletarTarefa(TarefaLista tarefa);
}
