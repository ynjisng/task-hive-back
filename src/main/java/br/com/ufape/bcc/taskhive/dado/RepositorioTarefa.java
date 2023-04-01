package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

@Repository
public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {
    
}
