package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.Comentario;

@Repository
public interface RepositorioComentario extends JpaRepository<Comentario, String> {
    
    public Comentario findByMensagem(String mensagem);

    public Comentario findById(Long id);

}
