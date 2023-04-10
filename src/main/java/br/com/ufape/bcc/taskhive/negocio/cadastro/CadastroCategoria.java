package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufape.bcc.taskhive.dado.RepositorioCategoria;
import br.com.ufape.bcc.taskhive.negocio.basicas.Categoria;

public class CadastroCategoria implements InterfaceCadastroCategoria {

    @Autowired
    private RepositorioCategoria repoCategoria;

    @Override
    public void salvarCategoria(Categoria entity) {
        repoCategoria.save(entity);
    }

    @Override
    public void deletarCategoria(Long id) {
        repoCategoria.findById(id);
    }

    @Override
    public void adicionarCategoria(String nome) {
        Categoria novaCategoria = new Categoria(nome);
        repoCategoria.save(novaCategoria);
    }

}
