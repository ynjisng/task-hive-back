package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Papel;

public interface InterfaceCadastroPapel {

    Papel procurarPapelId(long id);

    Papel salvarPapel(Papel p);

}