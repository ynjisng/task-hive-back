package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufape.bcc.taskhive.dado.RepositorioTarefaLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

public class CadastroTarefaLista
 implements InterfaceCadastroTarefaLista {
    @Autowired
    private RepositorioTarefaLista tarefaAbstrataRepositorio;

    @Override
    public void salvarTarefa (TarefaLista entity) {
        tarefaAbstrataRepositorio.save(entity);
    }

    @Override
    public TarefaLista procurarTarefaId(Long id) {
        return tarefaAbstrataRepositorio.findById(id).orElse(null);
    }

    @Override
    public TarefaLista procurarTarefa(String titulo) throws TarefaNaoExisteException {
        TarefaLista tarefa = tarefaAbstrataRepositorio.findByTitulo(titulo);
        if(tarefa != null)
            return tarefa;
        throw new TarefaNaoExisteException();
    }

    @Override
    public List<TarefaLista> listarTarefas() {
        return tarefaAbstrataRepositorio.findAll();
    }

    @Override
    public List<TarefaLista> listarTarefasUsuario(Usuario user) throws UsuarioSemTarefaException {
        List<TarefaLista> tarefa = tarefaAbstrataRepositorio.findByUsuario(user);
        if(tarefa != null)
            return tarefa;
        throw new UsuarioSemTarefaException(); // mudar exeção
    }

    /*
     * Implementar rota da Lixeira
     */
    @Override
    public void deletarTarefaId(Long id) {
        tarefaAbstrataRepositorio.deleteById(id); 
    }

    @Override
    public void deletarTarefa(TarefaLista tarefa) {
        tarefaAbstrataRepositorio.delete(tarefa);
    }    
    
}
