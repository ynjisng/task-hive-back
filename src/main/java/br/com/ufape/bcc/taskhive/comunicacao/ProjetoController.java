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

import br.com.ufape.bcc.taskhive.negocio.basicas.Projeto;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class ProjetoController {
    @Autowired
    private Fachada fachada;

    @PostMapping(value = "/projeto/cadastrar")
    public ResponseEntity<String> cadastrarProjeto(@RequestBody Projeto p) {
        try {
            fachada.salvarProjeto(p);
            return ResponseEntity.ok("Projeto criado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value="/projeto/{projetoId}")
    public ResponseEntity<Object> carregarUser(@PathVariable long projetoId) {
        return ResponseEntity.ok(fachada.procurarProjetoId(projetoId));
    }

    @GetMapping(value="/projeto/lista")
    public ResponseEntity<Object> listarProjetos() {
        return ResponseEntity.ok(fachada.listarProjetos());
    }
}
