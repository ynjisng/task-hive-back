package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.ufape.bcc.taskhive.dado.RepositorioComentario;

public class CadastroComentario implements InterfaceCadastroComentario {

    private String mensagem;
    private String novaMensageme;

    @Autowired
    private RepositorioComentario repoComentario;

    @Override
    public void deletarComentario(String mensagem) {
        repoComentario.findByNome(mensagem);
    }

    @Override
    public void atualizarComentario(String novaMensagem) {
        this.mensagem = novaMensagem;
    }
}
