package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioStatus;
import br.com.ufape.bcc.taskhive.negocio.basicas.Status;

@Service
public class CadastroStatus implements InterfaceCadastroStatus {

    @Autowired
    private RepositorioStatus repoStatus;

    @Override
    public void salvarStatus(Status entity) {
        repoStatus.save(entity);
    }
    
    @Override
    public void deletarStatus(Long id) {
        repoStatus.findById(id);
    }

    @Override
    public void adicionarStatus(String nome) {
        Status novoStatus = new Status(nome);
        repoStatus.save(novoStatus);
    }

    @Override
    public Status buscarStatusPorId(Long id) {
        return repoStatus.findById(id);
    }
    
}
