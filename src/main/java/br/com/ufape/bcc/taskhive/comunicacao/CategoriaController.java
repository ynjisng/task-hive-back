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

import br.com.ufape.bcc.taskhive.negocio.basicas.Categoria;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class CategoriaController {
    @Autowired
    private Fachada fachada;

    @PostMapping(value = "/categoria/salvar")
    public ResponseEntity<String> salvarCategoria(@RequestBody Categoria categoria) {
        try {
            fachada.salvarCategoria(categoria);
            return ResponseEntity.ok("Categoria salva com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/categoria/adicionar")
    public ResponseEntity<String> adicionarCategoria(@RequestBody Categoria categoria) {
        try {
            fachada.salvarCategoria(categoria);
            return ResponseEntity.ok("Categoria adicionada com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(value = "/categoria/deletar/{Id}")
    public ResponseEntity<String> deletarCategoria(@PathVariable long id) {
        try {
            fachada.deletarCategoria(id);
            return ResponseEntity.ok("Categoria deletada com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
