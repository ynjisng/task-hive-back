package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Lembrete;

public interface InterfaceCadastroLembrete {

    void deleterLembrete(String titulo);

    void atualizarLembrete(String novoTitulo);

}
