package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.RegistroStatus;
import br.com.ufape.bcc.taskhive.negocio.basicas.Status;
import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

public interface InterfaceCadastroRegistroStatus {
    RegistroStatus procurarRegitroId(Long id);
    
    RegistroStatus procurarRegistroTarefa(Tarefa tarefa);

    RegistroStatus procurarRegitroStatus(Status status);

	List<RegistroStatus> listarRegistro();

	void salvarRegistro(RegistroStatus entity);
}
