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

import br.com.ufape.bcc.taskhive.negocio.basicas.Status;
import br.com.ufape.bcc.taskhive.negocio.cadastro.DoisStatusException;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class StatusController {
    @Autowired
    private Fachada fachada;

    @PostMapping(value = "/status/adicionar")
    public ResponseEntity<String> adicionarStatus(@RequestBody Status status) {
        try {
            if (fachada.getStatus() != null) {
                throw new DoisStatusException();
            }
            fachada.salvarStatus(status);
            return ResponseEntity.ok("Status adicionado com sucesso!");
        } catch (DoisStatusException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(value = "/status/deletar/{id}")
    public ResponseEntity<String> deletarStatus(@PathVariable long id) {
        try {
            fachada.deletarStatus(id);
            return ResponseEntity.ok("Status deletado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/status/salvar")
    public ResponseEntity<String> salvarStatus(@RequestBody Status status) {
        try {
            fachada.salvarStatus(status);
            return ResponseEntity.ok("Status salvo com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
