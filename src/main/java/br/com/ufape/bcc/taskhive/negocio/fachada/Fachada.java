package br.com.ufape.bcc.taskhive.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.negocio.basicas.ItemLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.RegistroStatus;
import br.com.ufape.bcc.taskhive.negocio.basicas.Status;
import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;
import br.com.ufape.bcc.taskhive.negocio.basicas.TarefaLista;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroItemLista;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroRegistroStatus;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroTarefa;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroTarefaLista;

import br.com.ufape.bcc.taskhive.negocio.cadastro.TarefaNaoExisteException;
import br.com.ufape.bcc.taskhive.negocio.cadastro.UsuarioSemTarefaException;

@Service
public class Fachada {

    @Autowired
	private InterfaceCadastroTarefa negocioTarefa;
	@Autowired
	private InterfaceCadastroTarefaLista negocioTarefaLista;
	@Autowired
	private InterfaceCadastroItemLista negocioItemLista;
	@Autowired
	private InterfaceCadastroRegistroStatus negocioRegistroStatus;

    /*
	 * Cadastro Tarefa
	 */
	
	// métodos de leitura

	public List<Tarefa> listarTarefa(){
		return negocioTarefa.listarTarefas();
	}

	public Tarefa procurarTarefa(String titulo) throws TarefaNaoExisteException {
		return negocioTarefa.procurarTarefa(titulo);
	}

	public Tarefa procurarTarefaId(Long id) throws TarefaNaoExisteException {
		return negocioTarefa.procurarTarefaId(id);
	}

	public Tarefa procurarTarefaUsuario (Usuario user) {
		return negocioTarefa.listarTarefasUsuario(user);
	}

	// métodos de escrita

	public Tarefa salvarTarefa(Tarefa entity){
		return negocioTarefa.salvarTarefa(entity);
	}

	public Tarefa atualizarTarefa(Tarefa entity) throws TarefaNaoExisteException{
		Tarefa salva = negocioTarefa.procurarTarefaId(entity.getId());
		entity.setComentario(salva.getComentario());
		return negocioTarefa.salvarTarefa(entity);
	}

	public void deletarTarefaId(Long id){
		negocioTarefa.deletarTarefaId(id);
	}

	public void deletarTarefa(Tarefa entity){
		negocioTarefa.deletarTarefa(entity);
	}


	/*
	 * Cadastro Tarefa Lista
	 */

	 public List<TarefaLista> listarTarefaLista(){
		return negocioTarefaLista.listarTarefas();
	}

	public TarefaLista procurarTarefaLista(String titulo) throws TarefaNaoExisteException {
		return negocioTarefaLista.procurarTarefa(titulo);
	}

	public TarefaLista procurarTarefaListaId(Long id) throws TarefaNaoExisteException {
		return negocioTarefaLista.procurarTarefaId(id);
	}

	public List<TarefaLista> procurarTarefaListaUsuario (Usuario user) throws UsuarioSemTarefaException {
		return negocioTarefaLista.listarTarefasUsuario(user);
	}

	// métodos de escrita

	public TarefaLista salvarTarefaLista(TarefaLista entity){
		return negocioTarefaLista.salvarTarefa(entity);
	}

	public void atualizarTarefaLista(TarefaLista entity) throws TarefaNaoExisteException{
		TarefaLista salva = negocioTarefaLista.procurarTarefaId(entity.getId());
		entity.setSubtarefas(salva.getSubtarefas());
		negocioTarefaLista.salvarTarefa(entity);
	}

	public void deletarTarefaListaId(Long id){
		negocioTarefaLista.deletarTarefaId(id);
	}

	public void deletarTarefaLista(TarefaLista entity){
		negocioTarefaLista.deletarTarefa(entity);
	}


	/*
	 * Cadastro Item Lista
	 */

	public ItemLista procurarItemLista(String titulo) {
		return negocioItemLista.procurarItemLista(titulo);
	}

	public ItemLista procurarItemListaId(Long id) {
		return negocioItemLista.procurarItemListaId(id);
	}

	public ItemLista procurarItemChecked(boolean checked) {
		return negocioItemLista.procurarItemChecked(checked);
	}

	public List<ItemLista> listarItensLista() {
		return negocioItemLista.listarItensLista();
	}

	public void deletarItemListaId(Long id) {
		negocioItemLista.deletarItemListaId(id);
	}

	public void salvarItemLista(ItemLista entity) {
		negocioItemLista.deletarItemLista(entity);
	}

	public void atualizarItemLista(ItemLista entity) {
		negocioItemLista.deletarItemLista(entity);
	}

	public void deletarItemLista(ItemLista entity) {
		negocioItemLista.deletarItemLista(entity);
	}

	/*
	 * Cadastro Resgitro Status
	 */

	public RegistroStatus procurarRegitroId(Long id){
		return negocioRegistroStatus.procurarRegitroId(id);
	}
    
	public RegistroStatus procurarRegistroTarefa(Tarefa tarefa){
		return negocioRegistroStatus.procurarRegistroTarefa(tarefa);
	}
 
	public RegistroStatus procurarRegitroStatus(Status status){
		return negocioRegistroStatus.procurarRegitroStatus(status);
	}
 
	public List<RegistroStatus> listarRegistro(){
		return negocioRegistroStatus.listarRegistro();
	}
 
	public void salvarRegistro(RegistroStatus entity){
		negocioRegistroStatus.salvarRegistro(entity);
	}
 
	public void atualizarRegistro(RegistroStatus entity){
		negocioRegistroStatus.salvarRegistro(entity);
	}
	
}
