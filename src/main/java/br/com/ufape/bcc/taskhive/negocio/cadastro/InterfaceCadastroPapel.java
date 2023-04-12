package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.Papel;

public interface InterfaceCadastroPapel {

    Papel procurarPapelId(long id);

    Papel salvarPapel(Papel p);

    List<Papel> listarPapeis();
}