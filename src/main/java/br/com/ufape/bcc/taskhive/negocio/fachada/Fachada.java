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
import br.com.ufape.bcc.taskhive.negocio.basicas.Papel;
import br.com.ufape.bcc.taskhive.negocio.basicas.Projeto;
import br.com.ufape.bcc.taskhive.negocio.cadastro.EmailRepetidoException;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroPapel;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroProjeto;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroUsuario;
import br.com.ufape.bcc.taskhive.negocio.cadastro.UsuarioNaoExisteException;

//import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

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

	//Parte de Ricardo - classes Usuario, UsuarioTarefa, Papel e Projeto
	@Autowired
	private InterfaceCadastroUsuario cadastroUsuario;
	@Autowired
	private InterfaceCadastroProjeto cadastroProjeto;
	@Autowired
	private InterfaceCadastroPapel cadastroPapel;

	public Usuario salvarUsuario(Usuario entity) throws EmailRepetidoException{
		return cadastroUsuario.salvarUsuario(entity);
	}

    public Object procurarUsuarioId(long id) {
        return cadastroUsuario.procurarUsuarioId(id);
    }

	public Object logarComEmailAndSenha(String email, String senha) throws UsuarioNaoExisteException {
		return cadastroUsuario.logarComEmailAndSenha(email, senha);
	}

	public Projeto salvarProjeto(Projeto entity) {
		return cadastroProjeto.salvarProjeto(entity);
	}

	public Object procurarProjetoId(long projetoId) {
		return cadastroProjeto.procurarProjetoId(projetoId);
	}

    public Object listarProjetos() {
        return cadastroProjeto.listarProjetos();
    }

	public Papel salvarPapel(Papel p) {
		return cadastroPapel.salvarPapel(p);
	}

    public Object procurarPapelId(long papelId) {
        return cadastroPapel.procurarPapelId(papelId);
    }

    //@Autowired
	//private InterfaceNegocioTarefa negocioTarefa;

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
