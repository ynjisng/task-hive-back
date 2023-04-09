package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Status;

public interface InterfaceCadastroStatus {

    void deletarStatus(String descricao);

    void atualizarStatus(String novaDescricao);
    
}
