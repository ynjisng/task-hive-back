package br.com.ufape.bcc.taskhive.comunicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufape.bcc.taskhive.comunicacao.dto.GerenciarTarefaRequest;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class TarefaController {

    @Autowired
    private Fachada fachada;

    @PostMapping (value = "/tarefa/cadastrar")
    public ResponseEntity<String> cadastrar(@RequestBody GerenciarTarefaRequest request ) {
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
}
