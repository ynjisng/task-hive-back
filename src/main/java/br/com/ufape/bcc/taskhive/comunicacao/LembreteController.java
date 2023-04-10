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

import br.com.ufape.bcc.taskhive.negocio.basicas.Lembrete;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class LembreteController {
    @Autowired
    private Fachada fachada;

    @PostMapping(value = "/lembrete/salvar")
    public ResponseEntity<String> salvarLembrete(@RequestBody Lembrete lembrete) {
        try {
            fachada.salvarLembrete(lembrete);
            return ResponseEntity.ok("Lembrete salvo com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/lembrete/adicionar")
    public ResponseEntity<String> adicionarLembrete(@RequestBody Lembrete lembrete) {
        try {
            fachada.salvarLembrete(lembrete);
            return ResponseEntity.ok("Lembrete adicionado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(value = "/lembrete/deletar/{Id}")
    public ResponseEntity<String> deletarLembrete(@PathVariable long id) {
        try {
            fachada.deletarLembrete(id);
            return ResponseEntity.ok("Lembrete deletado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
