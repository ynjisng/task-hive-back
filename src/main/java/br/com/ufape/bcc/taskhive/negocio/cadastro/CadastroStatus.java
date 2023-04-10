package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.ufape.bcc.taskhive.dado.RepositorioStatus;

public class CadastroStatus implements InterfaceCadastroStatus {

    private String descricao;

    @Autowired
    private RepositorioStatus repoStatus;
    
    @Override
    public void deletarStatus(String descricao) {
        repoStatus.findByDescricao(descricao);
    }

    @Override
    public void atualizarStatus(String novaDescricao) {
        this.descricao = novaDescricao;
    }
}
