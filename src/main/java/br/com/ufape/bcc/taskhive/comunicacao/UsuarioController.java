package br.com.ufape.bcc.taskhive.comunicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufape.bcc.taskhive.comunicacao.dto.LoginRequest;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;
import br.com.ufape.bcc.taskhive.negocio.cadastro.EmailRepetidoException;
import br.com.ufape.bcc.taskhive.negocio.cadastro.UsuarioNaoExisteException;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
public class UsuarioController {
    @Autowired
    private Fachada fachada;

    @PostMapping(value = "/usuario/cadastrar")
    public ResponseEntity<String> cadastrarUser(@RequestBody Usuario u) {
        try {
            fachada.salvarUsuario(u);
            return ResponseEntity.ok("Usuario cadastrado com sucesso!");
        } catch (EmailRepetidoException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @GetMapping(value="/usuario/{usuarioId}")
    public ResponseEntity<Object> carregarUser(@PathVariable long usuarioId) {
        return ResponseEntity.ok(fachada.procurarUsuarioId(usuarioId));
    }

    @GetMapping(value="/usuario/login")
    public ResponseEntity<Object> login(@RequestBody LoginRequest dados) throws UsuarioNaoExisteException {
        return ResponseEntity.ok(fachada.logarComEmailAndSenha(dados.getEmail(), dados.getSenha()));
    }
}
