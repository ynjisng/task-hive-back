package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioRegistroStatus;
import br.com.ufape.bcc.taskhive.negocio.basicas.RegistroStatus;
import br.com.ufape.bcc.taskhive.negocio.basicas.Status;
import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

@Service
public class CadastroRegistroStatus implements InterfaceCadastroRegistroStatus{

        @Autowired
        private RepositorioRegistroStatus registroStatusrepo;

        @Override
        public RegistroStatus procurarRegitroId(Long id) {
                return registroStatusrepo.findById(id).orElse(null);
        }

        @Override
        public RegistroStatus procurarRegistroTarefa(Tarefa tarefa) {
                return registroStatusrepo.findByTarefa(tarefa);
        }

        @Override
        public RegistroStatus procurarRegitroStatus(Status status) {
                return registroStatusrepo.findByStatus(status);
        }

        @Override
        public List<RegistroStatus> listarRegistro() {
                return registroStatusrepo.findAll();
        }

        @Override
        public void salvarRegistro(RegistroStatus entity) {
                registroStatusrepo.save(entity);
        }


}
