package br.com.ufape.bcc.taskhive.negocio.basica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import br.com.ufape.bcc.taskhive.negocio.basicas.DataPrevistaIncorretaException;
import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

public class TarefaTest {
    
    // Teste da Geração da Estimativa
    @Test
    void testeGerarEstimativa() throws DataPrevistaIncorretaException{
        Date data_inicio = new Date();
        Date data_prevista = new Date(System.currentTimeMillis() + 2 * 24 * 60 * 60 * 1000);
        
        Tarefa tarefa = new Tarefa();
        assertEquals(2, tarefa.gerarEstimativaTempo(data_inicio, data_prevista));
    }

}
