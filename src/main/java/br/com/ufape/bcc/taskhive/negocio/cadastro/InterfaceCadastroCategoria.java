package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Categoria;

public interface InterfaceCadastroCategoria {

    void deletarCategoria(String nome);

    void atualizarCategoria(String novoNome);

}
