package br.com.ufape.bcc.taskhive.negocio.fachada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.negocio.basicas.Papel;
import br.com.ufape.bcc.taskhive.negocio.basicas.Projeto;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;
import br.com.ufape.bcc.taskhive.negocio.cadastro.EmailRepetidoException;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroPapel;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroProjeto;
import br.com.ufape.bcc.taskhive.negocio.cadastro.InterfaceCadastroUsuario;
import br.com.ufape.bcc.taskhive.negocio.cadastro.UsuarioNaoExisteException;

//import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

@Service
public class Fachada {

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

    /* public void criarTarefa( INFORMAÇÕES ) throws ContaNaoExisteException {
		Tarefa tarefa = negocioTarefa.procurarTarefaProjeto(numero);
		tarefa.criar(dados);
		negocioTarefa.atualizarProjeto(tarefa);
	} */
}
