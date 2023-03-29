package br.com.ufape.bcc.taskhive.dado;

import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaAbstrata;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class RepoTarefaAbstrataImple implements RepositorioTarefaAbstrata {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void salvar(TarefaAbstrata tarefa) {
        entityManager.persist(tarefa);
    }

    @Override
    public TarefaAbstrata buscarPorId(long id) {
        return entityManager.find(TarefaAbstrata.class, id);
    }

    @Override
    public void atualizar(TarefaAbstrata tarefa) {
        entityManager.merge(tarefa);
    }

    @Override
    public void excluir(TarefaAbstrata tarefa) {
        entityManager.remove(tarefa);
    }
    
}
