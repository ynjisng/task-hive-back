package br.com.ufape.bcc.taskhive.comunicacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import br.com.ufape.bcc.taskhive.comunicacao.dto.GerenciarTarefaRequest;
import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;
import br.com.ufape.bcc.taskhive.negocio.cadastro.TarefaNaoExisteException;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class TarefaController {

    @Autowired
    private Fachada fachada;

    @PostMapping (value = "/tarefa")
    public ResponseEntity<Tarefa> cadastrarTarefa(@RequestBody Tarefa tarefa) {
		return ResponseEntity.ok(fachada.salvarTarefa(tarefa));
	}

    @GetMapping (value = "/tarefa/{tarefaId}")
	public ResponseEntity<Tarefa> procurarTarefa(@PathVariable Long tarefaId) throws TarefaNaoExisteException {
		return ResponseEntity.ok(fachada.procurarTarefaId(tarefaId));
	}

    @GetMapping (value = "/tarefa")
	public ResponseEntity<List<Tarefa>> carregarTarefas() {
		return ResponseEntity.ok(fachada.listarTarefa());
	}

    @PatchMapping (value = "/tarefa/{tarefaId}")
	public ResponseEntity<Tarefa> atualizarTarefas(@RequestBody Tarefa tarefa, @PathVariable Long tarefaId) throws TarefaNaoExisteException {
        // AJUSTAR
        return ResponseEntity.ok(fachada.atualizarTarefa(tarefa));
		//return ResponseEntity.ok("Tarefa Atualizada com sucesso");
	}

    @DeleteMapping (value = "/tarefa/{tarefaId}")
	public ResponseEntity<String> deletarTarefas(@PathVariable Long tarefaId) {
		try {
            fachada.deletarTarefaId(tarefaId);
            return ResponseEntity.ok("Tarefa deletada com sucesso!");
        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
	}
}
