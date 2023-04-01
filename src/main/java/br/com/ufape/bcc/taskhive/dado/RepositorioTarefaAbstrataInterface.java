package br.com.ufape.bcc.taskhive.dado;

import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaAbstrata;

public interface RepositorioTarefaAbstrataInterface {
    void salvar(TarefaAbstrata tarefa);
    TarefaAbstrata buscarPorId(long id);
    void atualizar(TarefaAbstrata tarefa);
    void excluir(TarefaAbstrata tarefa);
}
    