package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.Papel;

@Repository
public interface RepositorioPapel extends JpaRepository<Papel, Long> {
    public Papel findById(long id);
}
