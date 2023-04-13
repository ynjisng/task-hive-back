package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Comentario;

public interface InterfaceCadastroComentario {

    void deletarComentario(Long id);

    void adicionarComentario(Comentario comentario);

    void salvarComentario(Comentario entity);
    
    Comentario buscarComentarioPorMensagem(String mensagem);

    Comentario buscarComentarioPorId(Long id);
}
