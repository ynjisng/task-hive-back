package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.Categoria;

@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria, String> {
    public Categoria findByNome(String nome);

    public Categoria findById(Long id);
}
