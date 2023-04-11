package br.com.ufape.bcc.taskhive.comunicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufape.bcc.taskhive.negocio.basicas.Papel;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class PapelController {
    @Autowired
    private Fachada fachada;

    @PostMapping(value = "/papel/cadastrar")
    public ResponseEntity<String> cadastrarProjeto(@RequestBody Papel p) {
        try {
            fachada.salvarPapel(p);
            return ResponseEntity.ok("Papel criado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value="/papel/{papelId}")
    public ResponseEntity<Object> carregarUser(@PathVariable long papelId) {
        return ResponseEntity.ok(fachada.procurarPapelId(papelId));
    }

    @GetMapping(value="/papel/lista")
    public ResponseEntity<Object> listarPapeis() {
        return ResponseEntity.ok(fachada.listarPapeis());
    }
}
