package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Comentario;

public interface InterfaceCadastroComentario {

    void deletarComentario(String mensagem);

    void atualizarComentario(String novaMensagem);
    
}
