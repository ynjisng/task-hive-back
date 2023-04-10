package br.com.ufape.bcc.taskhive.comunicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufape.bcc.taskhive.negocio.basicas.Comentario;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class ComentarioController {
    @Autowired
    private Fachada fachada;

    @PostMapping(value = "/comentario/salvar")
    public ResponseEntity<String> salvarComentario(@RequestBody Comentario comentario) {
        try {
            fachada.salvarComentario(comentario);
            return ResponseEntity.ok("Comentário salvo com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/comentario/adicionar")
    public ResponseEntity<String> adicionarComentario(@RequestBody Comentario comentario) {
        try {
            fachada.salvarComentario(comentario);
            return ResponseEntity.ok("Comentário adicionado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(value = "/comentario/deletar/{Id}")
    public ResponseEntity<String> deletarComentario(@PathVariable long id) {
        try {
            fachada.deletarComentario(id);
            return ResponseEntity.ok("Comentário deletado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
