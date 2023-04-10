package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Status;

public interface InterfaceCadastroStatus {

    void deletarStatus(Long id);

    void adicionarStatus(String nome);

    void salvarStatus(Status entity);
    
}
