package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.ufape.bcc.taskhive.dado.RepositorioComentario;

public class CadastroComentario implements InterfaceCadastroComentario {

    @Autowired
    private RepositorioComentario repoComentario;
    private String mensagem;

    @Override
    public void deletarComentario(String mensagem) {
        repoComentario.findByMensagem(mensagem);
    }

    @Override
    public void atualizarComentario(String novaMensagem) {
        this.mensagem = novaMensagem;
    }
}
