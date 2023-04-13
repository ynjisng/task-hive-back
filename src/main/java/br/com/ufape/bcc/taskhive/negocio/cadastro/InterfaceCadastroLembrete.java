package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Lembrete;

public interface InterfaceCadastroLembrete {

    void deleterLembrete(Long id);

    void adicionarLembrete(String titulo);

    void salvarLembrete(Lembrete entity);

    Lembrete buscarLembretePorId(Long id);
}
