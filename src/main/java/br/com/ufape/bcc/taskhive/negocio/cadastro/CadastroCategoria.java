package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufape.bcc.taskhive.dado.RepositorioCategoria;
import br.com.ufape.bcc.taskhive.negocio.basicas.Categoria;

public class CadastroCategoria implements InterfaceCadastroCategoria {

    private String nome; 

    @Autowired
    private RepositorioCategoria repoCategoria;

    @Override
    public void deletarCategoria(String nome) {
        repoCategoria.findByNome(nome);
    }

    @Override
    public void atualizarCategoria(String novoNome) {
        this.nome = novoNome;
    }

}
