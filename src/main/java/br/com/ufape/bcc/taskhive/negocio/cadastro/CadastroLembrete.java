package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufape.bcc.taskhive.dado.RepositorioLembrete;

public class CadastroLembrete implements InterfaceCadastroLembrete {

    @Autowired
    private RepositorioLembrete repoLembrete;
    private String titulo;

    @Override
    public void deleterLembrete(String titulo) {
        repoLembrete.findByTitulo(titulo);
    }

    @Override
    public void atualizarLembrete(String novoTitulo) {
        this.titulo = novoTitulo;
    }
    
}
