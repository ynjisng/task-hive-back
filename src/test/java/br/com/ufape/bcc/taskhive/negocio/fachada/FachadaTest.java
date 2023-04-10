package br.com.ufape.bcc.taskhive.negocio.fachada;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

@SpringBootTest
public class FachadaTest {
    @Autowired
    private Fachada fachada;

    @Test
    void testSalvarUsuarioEmailRepetido() {
        Usuario u1 = new Usuario("teste1", "teste@mail.com", "123");
        Usuario u2 = new Usuario("teste2", "teste@mail.com", "123");
        try {
            fachada.salvarUsuario(u1);
            fachada.salvarUsuario(u2);
            fail("Nao deve salvar usuarios com o mesmo email!");
        } catch (Exception e) {
            e.printStackTrace();
			assertTrue(true, "Ok");
        }
    }
}
