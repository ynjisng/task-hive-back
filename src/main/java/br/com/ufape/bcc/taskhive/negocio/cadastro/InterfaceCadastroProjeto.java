package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.Projeto;

public interface InterfaceCadastroProjeto {

    List<Projeto> procurarProjetoNome(String nome);

    Projeto procurarProjetoId(long id);

    List<Projeto> listarProjetos();

    void deletarProjetoId(long id);

    Projeto salvarProjeto(Projeto entity);

    void deletarProjeto(Projeto projeto);

}