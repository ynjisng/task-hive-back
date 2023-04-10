package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Categoria;

public interface InterfaceCadastroCategoria {

    void deletarCategoria(Long id);

    void adicionarCategoria(String nome);

    void salvarCategoria(Categoria entity);

}
