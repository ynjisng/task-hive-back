package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioItemLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.ItemLista;

@Service
public class CadastroItemLista implements InterfaceCadastroItemLista {

        @Autowired
        private RepositorioItemLista repoItemLista;

        @Override
        public ItemLista procurarItemLista(String titulo) {
                return repoItemLista.findByItem(titulo);
        }

        @Override
        public ItemLista procurarItemListaId(Long id) {
                return repoItemLista.findById(id).orElse(null);
        }

        @Override
        public ItemLista procurarItemChecked(boolean checked) {
                return repoItemLista.findByChecked(checked);
        }

        @Override
        public List<ItemLista> listarItensLista() {
                return repoItemLista.findAll();
        }

        @Override
        public void deletarItemListaId(Long id) {
                repoItemLista.deleteById(id);
        }

        @Override
        public ItemLista salvarItemLista(ItemLista entity) {
                return repoItemLista.save(entity);
        }

        @Override
        public void deletarItemLista(ItemLista entity) {
                repoItemLista.delete(entity);
        }

}
