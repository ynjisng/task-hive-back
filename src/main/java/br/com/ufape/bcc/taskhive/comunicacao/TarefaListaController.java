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

import br.com.ufape.bcc.taskhive.negocio.basicas.Comentario;
import br.com.ufape.bcc.taskhive.negocio.basicas.ItemLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;
import br.com.ufape.bcc.taskhive.negocio.cadastro.TarefaNaoExisteException;
import br.com.ufape.bcc.taskhive.negocio.cadastro.UsuarioSemTarefaException;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class TarefaListaController {
    
    @Autowired
    private Fachada fachada;

    @PostMapping (value = "/tarefalista")
    public ResponseEntity<TarefaLista> cadastrarTarefa(@RequestBody TarefaLista tarefalista) {
		return ResponseEntity.ok(fachada.salvarTarefaLista(tarefalista));
	}

    @GetMapping (value = "/tarefalista/{tarefaId}")
	public ResponseEntity<TarefaLista> procurarTarefa(@PathVariable Long tarefaId) throws TarefaNaoExisteException {
		return ResponseEntity.ok(fachada.procurarTarefaListaId(tarefaId));
	}

    @GetMapping (value = "/tarefalista")
	public ResponseEntity<List<TarefaLista>> carregarTarefas() {
		return ResponseEntity.ok(fachada.listarTarefaLista());
	}

    @PatchMapping (value = "/tarefalista/{tarefaId}")
	public ResponseEntity<String> atualizarTarefas(@RequestBody TarefaLista tarefalista, @PathVariable Long tarefaId) throws TarefaNaoExisteException {
        // AJUSTAR
        fachada.atualizarTarefaLista(tarefalista);
		return ResponseEntity.ok("TarefaLista Atualizada com sucesso");
	}

    @DeleteMapping (value = "/tarefalista/{tarefaId}")
	public ResponseEntity<String> deletarTarefas(@PathVariable Long tarefaId) {
		try {
            fachada.deletarTarefaListaId(tarefaId);
            return ResponseEntity.ok("TarefaLista deletada com sucesso!");
        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
	}

    @PostMapping(value = "/tarefalista/{tarefaId}/item")
	public ResponseEntity<ItemLista> adicionarSubtarefa(@RequestBody ItemLista item, @PathVariable long tarefaId) {
		try {
			return ResponseEntity.ok(fachada.addItemTarefaLista(tarefaId, item));
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

    @PostMapping(value = "/tarefalista/{tarefaId}/comentario")
	public ResponseEntity<Comentario> adicionarComentarioTarefa(@RequestBody Comentario coment, @PathVariable long tarefaId) {
		try {
			return ResponseEntity.ok(fachada.addComentarioTarefa(tarefaId, coment));
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

    @PostMapping(value = "/tarefalista/{tarefaId}/{userId}")
	public ResponseEntity<Usuario> adicionarUsuarioTarefa(@PathVariable long userId, @PathVariable long tarefaId) {
		try {
			return ResponseEntity.ok(fachada.addUsuarioTarefa(tarefaId, userId));
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
