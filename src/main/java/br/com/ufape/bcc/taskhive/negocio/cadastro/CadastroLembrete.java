package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioLembrete;
import br.com.ufape.bcc.taskhive.negocio.basicas.Lembrete;

@Service
public class CadastroLembrete implements InterfaceCadastroLembrete {

    @Autowired
    private RepositorioLembrete repoLembrete;

    @Override
    public void salvarLembrete(Lembrete entity) {
        repoLembrete.save(entity);
    }

    @Override
    public void deleterLembrete(Long id) {
        repoLembrete.findById(id);
    }

    @Override
    public void adicionarLembrete(String titulo) {
        Lembrete novoTitulo = new Lembrete(titulo);
        repoLembrete.save(novoTitulo);
    }

}
