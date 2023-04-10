package br.com.ufape.bcc.taskhive.comunicacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufape.bcc.taskhive.negocio.basicas.ItemLista;
import br.com.ufape.bcc.taskhive.negocio.fachada.Fachada;

@CrossOrigin
@RestController
public class ItemListaController {
    @Autowired
    private Fachada fachada;

    @PostMapping (value = "/itemlista")
    public ResponseEntity<String> cadastrarItemLista(@RequestBody ItemLista item) {
		fachada.salvarItemLista(item);
        return ResponseEntity.ok("Item criado na lista!");
	}

    @GetMapping (value = "/itemlista/{itemListaId}")
	public ResponseEntity<ItemLista> procurarItemLista(@PathVariable Long itemListaId) {
		return ResponseEntity.ok(fachada.procurarItemListaId(itemListaId));
	}

    @GetMapping (value = "/itemlista")
	public ResponseEntity<List<ItemLista>> carregarItemListas() {
		return ResponseEntity.ok(fachada.listarItensLista());
	}

    @PatchMapping (value = "/itemlista/{itemListaId}")
	public ResponseEntity<String> atualizarItemListas(@RequestBody ItemLista item, @PathVariable Long itemListaId) {
        // AJUSTAR
        fachada.atualizarItemLista(item);
		return ResponseEntity.ok("ItemLista Atualizada com sucesso");
	}

    @DeleteMapping (value = "/itemlista/{itemListaId}")
	public ResponseEntity<String> deletarItemListas(@PathVariable Long itemListaId) {
		try {
            fachada.deletarItemListaId(itemListaId);
            return ResponseEntity.ok("ItemLista deletada com sucesso!");
        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
	}
}
