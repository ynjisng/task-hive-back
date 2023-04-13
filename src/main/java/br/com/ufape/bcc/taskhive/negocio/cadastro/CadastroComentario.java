package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioComentario;
import br.com.ufape.bcc.taskhive.negocio.basicas.Comentario;

@Service
public class CadastroComentario implements InterfaceCadastroComentario {

    @Autowired
    private RepositorioComentario repoComentario;
    private String mensagem;

    @Override
    public Comentario salvarComentario(Comentario entity) {
        return repoComentario.save(entity);
    }

    @Override
    public void deletarComentario(Long id) {
        repoComentario.findById(id);
    }

    @Override
    public void adicionarComentario(String Comentario) {
        Comentario novaMensagem = new Comentario(mensagem);
        repoComentario.save(novaMensagem);
    }
    
}
