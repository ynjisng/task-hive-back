package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioTarefaLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

@Service
public class CadastroTarefaLista
 implements InterfaceCadastroTarefaLista {
    @Autowired
    private RepositorioTarefaLista tarefaListaRepo;

    @Override
    public TarefaLista salvarTarefa (TarefaLista entity) {
        return tarefaListaRepo.save(entity);
    }

    @Override
    public TarefaLista procurarTarefaId(Long id) {
        return tarefaListaRepo.findById(id).orElse(null);
    }

    @Override
    public TarefaLista procurarTarefa(String titulo) throws TarefaNaoExisteException {
        TarefaLista tarefa = tarefaListaRepo.findByTitulo(titulo);
        if(tarefa != null)
            return tarefa;
        throw new TarefaNaoExisteException();
    }

    @Override
    public List<TarefaLista> listarTarefas() {
        return tarefaListaRepo.findAll();
    }

    @Override
    public List<TarefaLista> listarTarefasUsuario(Usuario user) throws UsuarioSemTarefaException {
        //List<TarefaLista> tarefa = tarefaListaRepo.findByUsuario(user);
        List<TarefaLista> tarefa = tarefaListaRepo.findAll();
        if(tarefa != null)
            return tarefa;
        throw new UsuarioSemTarefaException(); // mudar exeção
    }

    /*
     * Implementar rota da Lixeira
     */
    @Override
    public void deletarTarefaId(Long id) {
        tarefaListaRepo.deleteById(id); 
    }

    @Override
    public void deletarTarefa(TarefaLista tarefa) {
        tarefaListaRepo.delete(tarefa);
    }    
    
}
