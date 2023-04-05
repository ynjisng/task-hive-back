package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

//import br.com.ufape.bcc.taskhive.negocio.basicas.ItemLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaLista;

public interface InterfaceCadastroTarefaLista {
	
    TarefaLista procurarTarefa(String titulo) throws TarefaNaoExiste;

    TarefaLista procurarTarefaId(Long id) throws TarefaNaoExiste;

	List<TarefaLista> listarTarefas();

	List<TarefaLista> listarTarefasUsuario();

	void deletarTarefaId(Long id);

	void salvarTarefa(TarefaLista entity);

	void deletarTarefa(TarefaLista tarefa);

	//void deletarItemLista(ItemLista itemTarefa);
}
