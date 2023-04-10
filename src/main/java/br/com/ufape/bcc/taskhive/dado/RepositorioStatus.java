package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.Status;

@Repository
public interface RepositorioStatus extends JpaRepository<Status, String> {

    public Status findByDescricao(String descricao);
    
}