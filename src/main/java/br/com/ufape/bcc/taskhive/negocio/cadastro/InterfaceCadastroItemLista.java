package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import br.com.ufape.bcc.taskhive.negocio.basicas.ItemLista;

public interface InterfaceCadastroItemLista {

        ItemLista procurarItemLista(String titulo);

        ItemLista procurarItemListaId(Long id);

        ItemLista procurarItemChecked(boolean checked);

        List<ItemLista> listarItensLista();

        void deletarItemListaId(Long id);

        void salvarItemLista(ItemLista entity);

        void deletarItemLista(ItemLista tarefa);
}
