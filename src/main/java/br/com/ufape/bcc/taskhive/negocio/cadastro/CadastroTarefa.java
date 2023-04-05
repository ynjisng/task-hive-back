package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufape.bcc.taskhive.dado.RepositorioTarefa;
import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

public class CadastroTarefa implements InterfaceCadastroTarefa {
    @Autowired
    private RepositorioTarefa tarefaRepo;

    @Override
    public void salvarTarefa (Tarefa entity) {
        tarefaRepo.save(entity);
    }

    @Override
    public Tarefa procurarTarefaId(Long id) {
        return tarefaRepo.findById(id).orElse(null);
    }

    @Override
    public Tarefa procurarTarefa(String titulo) throws TarefaNaoExisteException {
        Tarefa tarefa = tarefaRepo.findByTitulo(titulo);
        if(tarefa != null)
            return tarefa;
        throw new TarefaNaoExisteException();
    }

    @Override
    public List<Tarefa> listarTarefas() {
        return tarefaRepo.findAll();
    }

    @Override
    public Tarefa listarTarefasUsuario(Usuario user) {
        return tarefaRepo.findByUsuario(user);
    }

    /*
     * Implementar rota da Lixeira
     */
    @Override
    public void deletarTarefaId(Long id) {
        tarefaRepo.deleteById(id); 
    }

    @Override
    public void deletarTarefa(Tarefa tarefa) {
        tarefaRepo.delete(tarefa);
    }
    
}
