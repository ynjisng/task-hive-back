package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufape.bcc.taskhive.dado.RepositorioCategoria;

public class CadastroCategoria implements InterfaceCadastroCategoria {

    @Autowired
    private RepositorioCategoria repoCategoria;

    @Override
    public void deletarCategoria(String nome) {
        repoCategoria.findByNome(nome);
    }

    @Override
    public void atualizarCategoria(String novoNome) {
    }

}
