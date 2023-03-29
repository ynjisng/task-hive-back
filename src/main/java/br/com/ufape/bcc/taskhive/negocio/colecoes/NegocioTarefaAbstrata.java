package br.com.ufape.bcc.taskhive.negocio.colecoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufape.bcc.taskhive.dado.RepositorioTarefaAbstrata;
import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaAbstrata;

public class NegocioTarefaAbstrata implements InterfaceNegocioTarefaAbstrata {
    @Autowired
    private RepositorioTarefaAbstrata tarefaAbstrataRepositorio;

    @Override
    public void salvarTarefa (TarefaAbstrata tarefa) {
        tarefaAbstrataRepositorio.salvar(tarefa);
    }

    @Override
    public TarefaAbstrata procurarTarefaId(long id) {
        return tarefaAbstrataRepositorio.buscarPorId(id);
    }

    @Override
    public List<TarefaAbstrata> procurarTarefa(String titulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procurarTarefa'");
    }

    @Override
    public List<TarefaAbstrata> listarTarefas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTarefas'");
    }

    @Override
    public List<TarefaAbstrata> listarTarefasUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTarefasUsuario'");
    }

    @Override
    public void deletarTarefaId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarTarefaId'");
    }

    @Override
    public void deletarTarefa(TarefaAbstrata tarefa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarTarefa'");
    }
    
}
