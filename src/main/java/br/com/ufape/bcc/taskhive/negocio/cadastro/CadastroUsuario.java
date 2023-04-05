package br.com.ufape.bcc.taskhive.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioUsuario;
import br.com.ufape.bcc.taskhive.negocio.basicas.Usuario;

@Service
public class CadastroUsuario implements InterfaceCadastroUsuario {
    @Autowired
    private RepositorioUsuario colecaoUsuario;
    
    @Override
    public Usuario procurarUsuarioId(long id) {
        return colecaoUsuario.findById(id).orElse(null);
    }

    @Override
    public Usuario procurarUsuarioEmail(String email) throws UsuarioNaoExisteException {
        Usuario u = colecaoUsuario.findByEmail(email);
        if(u != null)
            return u;
        throw new UsuarioNaoExisteException();
    }

    @Override
    public Usuario salvarUsuario(Usuario u) throws EmailRepetidoException {
        try {
            procurarUsuarioEmail(u.getEmail());
            throw new EmailRepetidoException();
        } catch (UsuarioNaoExisteException ex) {
            return colecaoUsuario.save(u);
        }
    }

    @Override
    public Usuario atualizarUsuario(Usuario u) {
		return colecaoUsuario.save(u);
	}

	@Override
    public void deletarUsuario(Usuario u) {
		colecaoUsuario.delete(u);
	}
}
