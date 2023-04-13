package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Comentario;

public interface InterfaceCadastroComentario {

    void deletarComentario(Long id);

    void adicionarComentario(String mensagem);

    Comentario salvarComentario(Comentario entity);
    
}
