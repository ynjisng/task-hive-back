package br.com.ufape.bcc.taskhive.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

@Repository
public interface RepositorioTarefaLista extends JpaRepository<TarefaLista, Long>{
    public TarefaLista findByTitulo(String titulo);

    //public List<TarefaLista> findByUsuario(Usuario usuario);
}
