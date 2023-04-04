package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ufape.bcc.taskhive.negocio.basicas.RegistroStatus;
import br.com.ufape.bcc.taskhive.negocio.basicas.Status;
import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

public interface RepositorioRegistroStatus extends JpaRepository<RegistroStatus, Long> {
    public RegistroStatus findByTarefa(Tarefa tarefa);

    public RegistroStatus findByStatus(Status status);

}
