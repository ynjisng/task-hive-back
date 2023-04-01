package br.com.ufape.bcc.taskhive.negocio.basica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.ufape.bcc.taskhive.negocio.basicas.ItemLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaLista;

public class TarefaListaTest {
    
    @Test
    void testePercentualItens(){
        List<ItemLista> itens = new ArrayList<>();
        itens.add(new ItemLista("item1", false));
        itens.add(new ItemLista("item2", false));
        itens.add(new ItemLista("item3", true));
        itens.add(new ItemLista("item4", true));

        TarefaLista tarefa = new TarefaLista("Tarefa Lista Teste", null, itens);
        float perct = tarefa.percentualItensChecked(itens);

        assertEquals(50.0, perct);
    }
}
