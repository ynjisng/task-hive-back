package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
    public Usuario findByEmail(String email);
}
