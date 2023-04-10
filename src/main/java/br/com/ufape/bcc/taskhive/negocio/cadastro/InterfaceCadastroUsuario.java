package br.com.ufape.bcc.taskhive.negocio.cadastro;

import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

public interface InterfaceCadastroUsuario {

    Usuario procurarUsuarioId(long id);

    Usuario procurarUsuarioEmail(String email) throws UsuarioNaoExisteException;

    Usuario logarComEmailAndSenha(String email, String senha) throws UsuarioNaoExisteException;

    Usuario salvarUsuario(Usuario u) throws EmailRepetidoException;

    Usuario atualizarUsuario(Usuario u);

    void deletarUsuario(Usuario u);

}