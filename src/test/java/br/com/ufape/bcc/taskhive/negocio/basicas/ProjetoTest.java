package br.com.ufape.bcc.taskhive.negocio.basicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ProjetoTest {
    @Test
    void testGerarPercentualConclusao() {
        try {
            Projeto p = new Projeto("Teste", "Teste");
            TarefaAbstrata t = new TarefaAbstrata() {};
            TarefaAbstrata t2 = new TarefaAbstrata() {};
            t.setData_conclusao(new Date(1/1/2001));
            t2.setData_conclusao(null);
            List<TarefaAbstrata> ts = new ArrayList<TarefaAbstrata>();
            ts.add(t);
            ts.add(t2);
            assertEquals(50, p.gerarPercentualConclusao(ts));
        } catch (Exception e) {
            fail("Porcentagem errada!");
        }
    }
}