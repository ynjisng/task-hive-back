package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.ufape.bcc.taskhive.dado.RepositorioStatus;
import br.com.ufape.bcc.taskhive.negocio.basicas.Status;

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
    
}
