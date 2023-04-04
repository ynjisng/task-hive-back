package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.ItemLista;

@Repository
public interface RepositorioItemLista extends JpaRepository<ItemLista, Long> {
    public ItemLista findByChecked(boolean isChecked);
    public ItemLista findByItem(String item);
}
